package com.spring.core.service;

import com.spring.core.model.User;
import com.spring.core.service.interfaces.IValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class Service {

  @Value("${datasource.driver-class-name-1:anaaremere}")
  private String dbType;
  @Autowired
  private final IValidator validator;

  public Service(IValidator validator) {
    this.validator = validator;
  }

  public void save(User user) {
    if (validator.isValid(user)) {
      System.out.println("User " + user.getName()
          + " " + user.getSurname() + " saved successfully.");
    } else {
      System.out.println("User you are trying to save contains errors.");
    }
  }

  public String getDbType() {
    return dbType;
  }

}
