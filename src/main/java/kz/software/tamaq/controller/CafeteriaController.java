package kz.software.tamaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@Controller
@RequestMapping("/cafeteria")
public class CafeteriaController {

  @GetMapping
  public String cafeteriaPage() {
    return "cafeteria";
  }

}
