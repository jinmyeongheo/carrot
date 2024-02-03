package jm.carrot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  @GetMapping("/login")
  public String loginForm(){
    return "login";
  }

  @GetMapping("/sign-in")
  public String signInForm(){
    return "/sign-in";
  }

}
