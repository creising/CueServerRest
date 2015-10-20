package io.swagger.api.factories;

import io.swagger.api.PlaybackApiService;

import java.util.ServiceLoader;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-20T00:53:15.258Z")
public class PlaybackApiServiceFactory {

   public static PlaybackApiService getPlaybackApi()
   {
      System.out.println("getting");
      return ServiceLoader.load(PlaybackApiService.class).iterator().next();
   }
}
