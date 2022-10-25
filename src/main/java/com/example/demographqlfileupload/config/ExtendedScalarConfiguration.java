package com.example.demographqlfileupload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import graphql.kickstart.servlet.apollo.ApolloScalars;
import graphql.schema.GraphQLScalarType;

@Configuration
public class ExtendedScalarConfiguration {

  @Bean
  public GraphQLScalarType uploadScalar() {
      return ApolloScalars.Upload;
  }
}
