package org.urbanbyte.cueserver.server;

import io.swagger.api.ChannelApiService;
import io.swagger.api.NotFoundException;
import org.codehaus.jackson.map.ObjectMapper;
import org.urbanbyte.cueserver.CueServerClient;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Arrays;

/**
 * author: Chris Reising
 */
public class ChannelEndpoint extends ChannelApiService
{
    private final CueServerClient client;
    private final ObjectMapper mapper = new ObjectMapper();

    public ChannelEndpoint()
    {
        client = CommonCueServer.getCueServerInstance();
    }

    @Override
    public Response channelGet(Integer start, Integer end) throws NotFoundException
    {
        if(!isValidChannel(start) || !isValidChannel(end))
        {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        if(start > end)
        {
            int tempStart = start;
            start = end;
            end  = tempStart;
        }

        Integer[] levels = Arrays.copyOfRange(client.getOutputLevels(),start - 1, end);
        try
        {
            return Response.ok(mapper.writeValueAsString(levels),
                    MediaType.APPLICATION_JSON).status(Response.Status.OK).build();
        }
        catch (IOException e)
        {
            return Response.serverError().build();
        }
    }

    @Override
    public Response setChannel(Integer channelNumber, Integer level) throws NotFoundException
    {
        if(!isValidChannel(channelNumber) || level < 0 || level > 255)
        {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        client.setChannel(channelNumber, level);
        return Response.status(Response.Status.OK).build();
    }

    private boolean isValidChannel(int channel)
    {
        return channel > 0 && channel < 513;
    }
}
