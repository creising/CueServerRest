package org.urbanbyte.cueserver.server;

import io.swagger.api.CueApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.RecordedCue;
import org.codehaus.jackson.map.ObjectMapper;
import org.urbanbyte.cueserver.CueServerClient;

import javax.ws.rs.core.Response;

/**
 * author: Chris Reising
 */
public class CueEndpoint extends CueApiService
{
    private final CueServerClient client;
    private final ObjectMapper mapper = new ObjectMapper();

    public CueEndpoint()
    {
        this.client = CommonCueServer.getCueServerInstance();
    }

    @Override
    public Response cuePut(RecordedCue cue) throws NotFoundException
    {
        double cueNumber = cue.getNumber().doubleValue();
        if(!isValidCueNumber(cue.getNumber().doubleValue()))
        {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        client.recordCue(cueNumber, cue.getDowntime().doubleValue(),
                cue.getUptime().doubleValue());
        return Response.status(Response.Status.CREATED).build();
    }

    @Override
    public Response deleteCue(Double cueNumber) throws NotFoundException
    {
        if(!isValidCueNumber(cueNumber))
        {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        client.deleteCue(cueNumber);
        return Response.status(Response.Status.OK).build();
    }

    private boolean isValidCueNumber(Double cueNumber)
    {
        if(cueNumber == null)
        {
            return false;
        }
        else if(cueNumber < 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
