package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-17T19:55:06.226Z")
public abstract class PlaybackApiService {
  
      public abstract Response playbackGet(Integer playback)
      throws NotFoundException;
  
      public abstract Response playCue(PlaybackCue cue)
      throws NotFoundException;
  
}
