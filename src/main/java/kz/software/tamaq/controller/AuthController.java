package kz.software.tamaq.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@Controller
@RequestMapping("/auth")
public class AuthController {
  @GetMapping("/login")
  public String loginPage() {
    return "auth/signIn";
  }
  @GetMapping("/registration")
  public String registration() {
    return "auth/signUp";
  }

}
