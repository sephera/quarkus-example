package com.example.config;

import io.opentelemetry.sdk.extension.aws.trace.AwsXrayIdGenerator;
import io.opentelemetry.sdk.trace.IdGenerator;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

@Singleton
public class TracingConfig {
  @Produces
  @Singleton
  public IdGenerator idGenerator() {
    return AwsXrayIdGenerator.getInstance();
  }
}
