package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.pacifico.Entities.Admin;

public interface IAdmin extends JpaRepository<Admin, Long> {
}
