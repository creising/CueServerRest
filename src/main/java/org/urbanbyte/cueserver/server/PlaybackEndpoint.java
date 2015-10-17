package org.urbanbyte.cueserver.server;

import io.swagger.api.NotFoundException;
import io.swagger.api.PlaybackApiService;
import io.swagger.model.Cue;
import io.swagger.model.Playback;
import io.swagger.model.PlaybackCue;
import org.codehaus.jackson.map.ObjectMapper;
import org.urbanbyte.cueserver.CueServerClient;
import org.urbanbyte.cueserver.data.playback.DetailedPlaybackStatus;
import org.urbanbyte.cueserver.data.playback.PlaybackInfo;
import org.urbanbyte.cueserver.http.HttpCueServerClient;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * author: Chris Reising
 */
public class PlaybackEndpoint extends PlaybackApiService
{
    private final CueServerClient client;
    private final ObjectMapper mapper = new ObjectMapper();

    public PlaybackEndpoint()
    {
        client = new HttpCueServerClient("http://cueserver.dnsalias.com");
    }

    @Override
    public Response playbackGet(Integer playbackNumber) throws NotFoundException
    {
        if(playbackNumber < 1 || playbackNumber > 4)
        {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        org.urbanbyte.cueserver.data.playback.Playback playback =
                convertPlayback(playbackNumber);

        DetailedPlaybackStatus info = client.getDetailedPlaybackInfo(playback);

        Playback toReturn = new Playback();
        toReturn.setPlayback(info.getPlayback().name());
        toReturn.setCurrentCue(convertCueServerCue(info.getCurrentCue()));
        toReturn.setNextCue(convertCueServerCue(info.getNextCue()));

        try
        {
            return Response.ok(mapper.writeValueAsString(toReturn),
                    MediaType.APPLICATION_JSON).status(Response.Status.OK).build();
        } catch (IOException e)
        {
            return Response.serverError().build();
        }
    }

    @Override
    public Response playCue(PlaybackCue cue) throws NotFoundException
    {
        int playbackNumber = cue.getPlaybackNumber();
        if(playbackNumber < 1 || playbackNumber > 4 )
        {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        org.urbanbyte.cueserver.data.playback.Playback playback =
                convertPlayback(playbackNumber);

        client.playCue(cue.getCueNumber().doubleValue(), playback);
        return Response.status(Response.Status.ACCEPTED).build();
    }

    private org.urbanbyte.cueserver.data.playback.Playback convertPlayback(int playbackNumber)
    {
        org.urbanbyte.cueserver.data.playback.Playback playback;

        switch (playbackNumber)
        {
            case 1:
                playback = org.urbanbyte.cueserver.data.playback.Playback.PLAYBACK_1;
                break;
            case 2:
                playback = org.urbanbyte.cueserver.data.playback.Playback.PLAYBACK_2;
                break;
            case 3:
                playback = org.urbanbyte.cueserver.data.playback.Playback.PLAYBACK_3;
                break;
            default:
                playback = org.urbanbyte.cueserver.data.playback.Playback.PLAYBACK_4;
                break;
        }
        return playback;
    }

    private Cue convertCueServerCue(org.urbanbyte.cueserver.data.cue.Cue cue)
    {
        Cue converted = new Cue();
        if(cue != null)
        {
            converted.setName(cue.getName());
            converted.setNumber(BigDecimal.valueOf(cue.getNumber()));
        }
        return converted;
    }
}
