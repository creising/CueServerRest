package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CueApiService;
import io.swagger.api.factories.CueApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.RecordedCue;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/cue")

@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/cue", description = "the cue API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-20T02:57:28.659Z")
public class CueApi  {

   private final CueApiService delegate = CueApiServiceFactory.getCueApi();

    @PUT
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Records the current levels to the given cue", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Cue recorded", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Cue data was not valid", response = Void.class) })

    public Response cuePut(@ApiParam(value = "Cue to be recorded" ,required=true ) RecordedCue cue)
    throws NotFoundException {
        return delegate.cuePut(cue);
    }
    @DELETE
    @Path("/{cueNumber}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Deletes the given cue", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class) })

    public Response deleteCue(@ApiParam(value = "deletes the given cue",required=true ) @PathParam("cueNumber") Double cueNumber)
    throws NotFoundException {
        return delegate.deleteCue(cueNumber);
    }
}

