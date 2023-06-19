package kz.software.tamaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/toplist")
public class ListTopController {

  @GetMapping("/")
  public String topListPage() {
    return "toplist";
  }
}
