package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SystemApiService;
import io.swagger.api.factories.SystemApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/system")

@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/system", description = "the system API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-26T21:02:19.775Z")
public class SystemApi  {

   private final SystemApiService delegate = SystemApiServiceFactory.getSystemApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "System Info", notes = "The System endpoint get the current system information from the CueServer", response = Object.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "System information", response = Object.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Object.class) })

    public Response systemGet()
    throws NotFoundException {
        return delegate.systemGet();
    }
}

