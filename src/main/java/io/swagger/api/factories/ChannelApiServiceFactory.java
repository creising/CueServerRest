package io.swagger.api.factories;

import io.swagger.api.ChannelApiService;

import java.util.ServiceLoader;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-20T00:53:15.258Z")
public class ChannelApiServiceFactory {

   public static ChannelApiService getChannelApi()
   {
      return ServiceLoader.load(ChannelApiService.class).iterator().next();
   }
}
