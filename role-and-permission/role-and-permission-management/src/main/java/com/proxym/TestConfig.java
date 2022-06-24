package com.proxym;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component

public class TestConfig {
  @PostConstruct
  public void init (){
      System.out.println("Test ");
  }
}
