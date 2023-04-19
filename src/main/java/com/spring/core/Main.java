package com.spring.core;

import com.spring.core.config.ApplicationConfig;
import com.spring.core.model.User;
import com.spring.core.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    Service service = (Service) applicationContext.getBean("service");
    User myUser = new User("Emilian", "Marian");

    service.save(myUser);

    System.out.println(service.getDbType());
  }
}
