package jm.carrot.rest_controller;

import jm.carrot.dto.request.SignInForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @PostMapping("/sign/in")
  public String signIn(@RequestBody SignInForm req){
    String id = req.getId();
    String pw = req.getPw();
    return "ok";
  }

}
