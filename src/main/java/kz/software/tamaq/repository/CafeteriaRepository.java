package kz.software.tamaq.repository;

import kz.software.tamaq.model.Cafeteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@Repository
public interface CafeteriaRepository extends JpaRepository<Cafeteria, Long> {
}
