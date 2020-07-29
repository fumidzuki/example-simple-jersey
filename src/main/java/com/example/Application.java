package com.example;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class Application extends ResourceConfig {

  public Application() {
    this.packages(this.getClass().getPackage().getName());
  }

}
