package com.SmartContact.SmartContact.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@RequestMapping("/user")
public class MyController {

  @GetMapping("/index")
  public String about(Model model) {

    model.addAttribute("name", "Smart Contact Manager");
    model.addAttribute("id", 1234);
    return "about";
  }

}
