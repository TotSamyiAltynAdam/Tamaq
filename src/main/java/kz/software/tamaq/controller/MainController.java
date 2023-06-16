package kz.software.tamaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@Controller
@RequestMapping("/main")
public class MainController {


  @GetMapping
  public String mainPage() {
    System.out.println("main page");
    return "index";
  }
}
