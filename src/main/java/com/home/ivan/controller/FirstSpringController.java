package com.home.ivan.controller;

import com.home.ivan.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class FirstSpringController {

  @Autowired
  private Greeting greeting;

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String firstCtrl(ModelMap model) {
    String daytime = greeting.getDaytime(new Date());
    model.addAttribute("message", "Good " + daytime + "! This is My First Spring MVC Web Controller.");
    return "firstCtrl";
  }

  public void setGreeting(Greeting greeting) {
    this.greeting = greeting;
  }
}
