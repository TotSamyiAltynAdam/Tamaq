package kz.software.tamaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apparat")
public class ApparatController {

  @GetMapping
  public String apparatPage() {
    return "apparat";
  }
}
