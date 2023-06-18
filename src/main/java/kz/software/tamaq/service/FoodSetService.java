package kz.software.tamaq.service;

import kz.software.tamaq.model.Apparat;
import kz.software.tamaq.model.FoodSet;
import kz.software.tamaq.repository.FoodSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@Service
@Transactional(readOnly = true)
public class FoodSetService {
  private final FoodSetRepository foodSetRepository;

  @Autowired
  public FoodSetService(FoodSetRepository foodSetRepository) {
    this.foodSetRepository = foodSetRepository;
  }

//  public List<FoodSet> findByApparat(Apparat apparat) {
//    return foodSetRepository.findByApparat(apparat);
//  }

}
