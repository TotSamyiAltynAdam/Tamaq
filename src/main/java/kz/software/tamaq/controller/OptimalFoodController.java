package kz.software.tamaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/optimalFood")
public class OptimalFoodController {

  @GetMapping(value="/")
  public String optimalFoodPage() {
    return "optimal";
  }
}
