package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.pacifico.Entities.CallOfTender;

public interface ICallOfTender extends JpaRepository<CallOfTender, Long> {
}
