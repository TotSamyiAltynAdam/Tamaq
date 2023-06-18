package kz.software.tamaq.repository;

import kz.software.tamaq.model.Apparat;
import kz.software.tamaq.model.Food;
import kz.software.tamaq.model.FoodSet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

public interface FoodSetRepository extends JpaRepository<FoodSet, Long> {

}
