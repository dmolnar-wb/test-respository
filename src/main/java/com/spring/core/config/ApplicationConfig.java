package com.spring.core.config;

import com.spring.core.service.Service;
import com.spring.core.service.Validator;
import com.spring.core.service.interfaces.IValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.spring.core.service"})
@PropertySource("application.properties")
public class ApplicationConfig {

  @Bean
  public IValidator getValidator() {
    return new Validator("John",
        "Doe");
  }

//  @Bean(name = "service")
//  public Service getService() {
//    return new Service(getValidator());
//  }
}
