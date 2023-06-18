package kz.software.tamaq.service;

import kz.software.tamaq.model.Cafeteria;
import kz.software.tamaq.repository.CafeteriaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@Service
@Transactional(readOnly = true)
public class CafeteriaService {
  private final CafeteriaRepository cafeteriaRepository;

  public CafeteriaService(CafeteriaRepository cafeteriaRepository) {
    this.cafeteriaRepository = cafeteriaRepository;
  }


  public List<Cafeteria> findAll() {
    return cafeteriaRepository.findAll();
  }

  public Cafeteria findById(Long id) {
    return cafeteriaRepository.findById(id).orElse(null);
  }

}
