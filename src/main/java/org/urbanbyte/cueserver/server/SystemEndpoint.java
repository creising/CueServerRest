package org.urbanbyte.cueserver.server;

import io.swagger.api.NotFoundException;
import io.swagger.api.SystemApiService;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * author: Chris Reising
 */
public class SystemEndpoint extends SystemApiService
{
    @Override
    public Response systemGet() throws NotFoundException
    {
        return Response.ok("{\"system\":{\"deviceName\":\"from endpoint\", \"model\":\"123\",\"serialNumber\":\"sn\",\"time\":\"now\",\"hasPassword\":\"false\"}}", MediaType.APPLICATION_JSON).build();
    }
}
