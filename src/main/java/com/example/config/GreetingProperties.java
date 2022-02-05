package com.example.config;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.config.inject.ConfigProperties;

@Getter
@Setter
@ConfigProperties(prefix = "greeting")
public class GreetingProperties {
  private String name;

  private String message;
}
