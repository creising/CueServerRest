package org.urbanbyte.cueserver.server;

import io.swagger.api.NotFoundException;
import io.swagger.api.SystemApiService;
import org.codehaus.jackson.map.ObjectMapper;
import org.urbanbyte.cueserver.CueServerClient;
import org.urbanbyte.cueserver.data.system.SystemInfo;
import org.urbanbyte.cueserver.http.HttpCueServerClient;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * author: Chris Reising
 */
public class SystemEndpoint extends SystemApiService
{
    private final CueServerClient client;
    private final ObjectMapper mapper = new ObjectMapper();

    public SystemEndpoint()
    {
        client = new HttpCueServerClient("http://cueserver.dnsalias.com");
    }

    @Override
    public Response systemGet() throws NotFoundException
    {
        SystemInfo system = client.getSystemInfo();
        try
        {
            mapper.writeValueAsString(system);
            return Response.ok(mapper.writeValueAsString(system),
                    MediaType.APPLICATION_JSON).build();
        }
        catch (IOException e)
        {
            return Response.serverError().build();
        }
    }
}
