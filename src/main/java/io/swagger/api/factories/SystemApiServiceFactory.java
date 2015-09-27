package io.swagger.api.factories;

import io.swagger.api.SystemApiService;
import io.swagger.api.impl.SystemApiServiceImpl;

import java.util.ServiceLoader;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-26T21:02:19.775Z")
public class SystemApiServiceFactory {

   private final static SystemApiService service = new SystemApiServiceImpl();

   public static SystemApiService getSystemApi()
   {
      return ServiceLoader.load(SystemApiService.class).iterator().next();
   }
}
