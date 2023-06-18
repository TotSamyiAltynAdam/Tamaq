package kz.software.tamaq.controller;

import kz.software.tamaq.service.CafeteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@Controller
@RequestMapping("/cafeteria")
public class CafeteriaController {

  private final CafeteriaService cafeteriaService;

  @Autowired
  public CafeteriaController(CafeteriaService cafeteriaService) {
    this.cafeteriaService = cafeteriaService;
  }

  @GetMapping
  public String cafeteriaPage() {
    return "cafeteria";
  }
  @GetMapping("{id}")
  public String getCafeteria(@PathVariable Long id) {
    cafeteriaService.findById(id);
    return "cafeteria";
  }
}
