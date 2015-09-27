package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-26T21:02:19.775Z")
public class SystemApiServiceImpl extends SystemApiService {
  
      @Override
      public Response systemGet()
      throws NotFoundException {
      // do some magic!
      return Response.ok("{system:now}", MediaType.APPLICATION_JSON).build();
  }
  
}
