package io.swagger.api.factories;

import io.swagger.api.PlaybackApiService;

import java.util.ServiceLoader;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-17T19:55:06.226Z")
public class PlaybackApiServiceFactory {

   public static PlaybackApiService getPlaybackApi()
   {
      return ServiceLoader.load(PlaybackApiService.class).iterator().next();
   }
}
