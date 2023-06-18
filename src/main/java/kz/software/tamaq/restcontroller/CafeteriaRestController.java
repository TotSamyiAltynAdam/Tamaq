package kz.software.tamaq.restcontroller;

import kz.software.tamaq.model.Cafeteria;
import kz.software.tamaq.service.CafeteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@RestController
@RequestMapping("/api/cafeteria")
public class CafeteriaRestController {
  private final CafeteriaService cafeteriaService;

  @Autowired
  public CafeteriaRestController(CafeteriaService cafeteriaService) {
    this.cafeteriaService = cafeteriaService;
  }

  @GetMapping
  public List<Cafeteria> findAll() {
    return cafeteriaService.findAll();
  }

  @GetMapping("/{id}")
  public Cafeteria getPage(@PathVariable Long id) {
    return cafeteriaService.findById(id);
  }
}
