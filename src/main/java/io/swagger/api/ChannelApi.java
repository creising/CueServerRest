package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ChannelApiService;
import io.swagger.api.factories.ChannelApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/channel")

@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/channel", description = "the channel API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-20T02:57:28.659Z")
public class ChannelApi  {

   private final ChannelApiService delegate = ChannelApiServiceFactory.getChannelApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get the levels for the given range of channels.", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request valid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Channels were not valid", response = Void.class) })

    public Response channelGet(@ApiParam(value = "the first channel", defaultValue="1") @QueryParam("start") Integer start,
    @ApiParam(value = "the last channel", defaultValue="512") @QueryParam("end") Integer end)
    throws NotFoundException {
        return delegate.channelGet(start,end);
    }
    @PUT
    @Path("/{channelNumber}/{level}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Sets the given channel to a level", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request valid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Channels were not valid", response = Void.class) })

    public Response setChannel(@ApiParam(value = "The channel to set",required=true ) @PathParam("channelNumber") Integer channelNumber,
    @ApiParam(value = "The channel to set",required=true ) @PathParam("level") Integer level)
    throws NotFoundException {
        return delegate.setChannel(channelNumber,level);
    }
}

