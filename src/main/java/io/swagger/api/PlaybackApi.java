package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PlaybackApiService;
import io.swagger.api.factories.PlaybackApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Playback;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/playback")

@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/playback", description = "the playback API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-20T02:57:28.659Z")
public class PlaybackApi  {

   private final PlaybackApiService delegate = PlaybackApiServiceFactory.getPlaybackApi();

    @PUT
    @Path("/clear/{number}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Plays a cue in the given playback", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "Playback cleared", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Playback data was not valid", response = Void.class) })

    public Response clearPlayback(@ApiParam(value = "The number of the playback to get the status of.",required=true ) @PathParam("number") Integer number)
    throws NotFoundException {
        return delegate.clearPlayback(number);
    }
    @GET
    @Path("/{number}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Plackback Info", notes = "Get the summary of a CueServer's playback.", response = Playback.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Playback information", response = Playback.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Playback data was not valid", response = Playback.class) })

    public Response getPlayback(@ApiParam(value = "The number of the playback to get the status of.",required=true ) @PathParam("number") Integer number)
    throws NotFoundException {
        return delegate.getPlayback(number);
    }
    @PUT
    @Path("/{number}/cue/{cueNumber}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Plays a cue in the given playback", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "Cue played", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Cue and/or playback data was not valid", response = Void.class) })

    public Response playCue(@ApiParam(value = "The number of the playback to get the status of.",required=true ) @PathParam("number") Integer number,
    @ApiParam(value = "The number of the cue to play on the playback",required=true ) @PathParam("cueNumber") Double cueNumber)
    throws NotFoundException {
        return delegate.playCue(number,cueNumber);
    }
}

