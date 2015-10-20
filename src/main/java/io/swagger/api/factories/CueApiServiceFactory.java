package io.swagger.api.factories;

import io.swagger.api.CueApiService;

import java.util.ServiceLoader;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-20T00:53:15.258Z")
public class CueApiServiceFactory {

   public static CueApiService getCueApi()
   {
      return ServiceLoader.load(CueApiService.class).iterator().next();
   }
}
