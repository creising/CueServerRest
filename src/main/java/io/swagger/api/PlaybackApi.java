package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PlaybackApiService;
import io.swagger.api.factories.PlaybackApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Playbacks;
import io.swagger.model.Error;
import io.swagger.model.PlaybackCue;

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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-17T19:55:06.226Z")
public class PlaybackApi  {

   private final PlaybackApiService delegate = PlaybackApiServiceFactory.getPlaybackApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Plackback Info", notes = "Get the summary of a CueServer's playbacks", response = Playbacks.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Playback information", response = Playbacks.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Playbacks.class) })

    public Response playbackGet(@ApiParam(value = "The number of thr playback to get", defaultValue="1") @QueryParam("playback") Integer playback)
    throws NotFoundException {
        return delegate.playbackGet(playback);
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Plays a cue in the given playback", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "Cue played", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Cue and/or playback data was not valid", response = Void.class) })

    public Response playCue(@ApiParam(value = "Cue and playback to be played" ,required=true ) PlaybackCue cue)
    throws NotFoundException {
        return delegate.playCue(cue);
    }
}

