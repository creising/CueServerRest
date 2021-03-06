package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Playback;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-20T02:57:28.659Z")
public abstract class PlaybackApiService {
  
      public abstract Response clearPlayback(Integer number)
      throws NotFoundException;
  
      public abstract Response getPlayback(Integer number)
      throws NotFoundException;
  
      public abstract Response playCue(Integer number,Double cueNumber)
      throws NotFoundException;
  
}
