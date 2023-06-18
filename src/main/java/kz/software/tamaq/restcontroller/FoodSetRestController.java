package kz.software.tamaq.restcontroller;

import kz.software.tamaq.model.Apparat;
import kz.software.tamaq.model.FoodSet;
import kz.software.tamaq.service.FoodSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@RestController
@RequestMapping("/api/foodSet")
public class FoodSetRestController {

  private final FoodSetService foodSetService;

  @Autowired
  public FoodSetRestController(FoodSetService foodSetService) {
    this.foodSetService = foodSetService;
  }

//  @GetMapping
//  public List<FoodSet> getByApparat(@RequestBody Apparat apparat) {
//    return foodSetService.findByApparat(apparat);
//  }

}
