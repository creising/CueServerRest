package io.swagger.api.factories;

import io.swagger.api.SystemApiService;

import java.util.ServiceLoader;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-20T00:53:15.258Z")
public class SystemApiServiceFactory {

   public static SystemApiService getSystemApi()
   {
      return ServiceLoader.load(SystemApiService.class).iterator().next();
   }
}
