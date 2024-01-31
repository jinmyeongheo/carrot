package jm.carrot.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

  @GetMapping("/call/test")
  public String test(HttpServletResponse response, Model model) {

    Cookie cookie = new Cookie("userId", "noSpaceInCookie");
    cookie.setMaxAge(60);
    response.addCookie(cookie);
    return "test/test";
  }

  @GetMapping("/call/back")
  public String back(HttpServletResponse response ,Model model,
      @CookieValue(value = "userId") Cookie cookie) {

    String value = cookie.getValue();
    model.addAttribute("cookie1", value);

    return "test/back";

  }

}
