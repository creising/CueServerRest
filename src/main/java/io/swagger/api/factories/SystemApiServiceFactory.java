package io.swagger.api.factories;

import io.swagger.api.SystemApiService;
import io.swagger.api.impl.SystemApiServiceImpl;

import java.util.ServiceLoader;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-10-17T19:55:06.226Z")
public class SystemApiServiceFactory {

   private final static SystemApiService service = new SystemApiServiceImpl();

   public static SystemApiService getSystemApi()
   {
      return ServiceLoader.load(SystemApiService.class).iterator().next();
   }
}
