package kz.software.tamaq.controller;

import kz.software.tamaq.service.CafeteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@Controller
@RequestMapping("/main")
public class MainController {

  @Autowired
  private CafeteriaService cafeteriaService;

  @GetMapping(value = "/")
  public String mainPage(Model model) {
    model.addAttribute("cafeterias",cafeteriaService.findAll());
    return "index";
  }
}
