package com.tomcat.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {
	String n[]= {"James","Sharan","Hari","Jack","Roger","Peter"};
  @GetMapping("/greet")
  public String greet() {
	  return "Updated Spring boot is running with pipeline script - Coded Now- inclusive";
  }
  
  @GetMapping("/greet2")
  public String greet2() {
	  return "Hi!!! Spring boot2 is running ..New Change and Change it";
  }
  @GetMapping("/people")
  public String[] people() {
	  return n;
  }
  
}
