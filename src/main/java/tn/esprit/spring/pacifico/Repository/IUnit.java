package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.pacifico.Entities.Unit;

public interface IUnit extends JpaRepository<Unit, Long> {
}
