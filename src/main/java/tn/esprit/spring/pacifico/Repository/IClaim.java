package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.pacifico.Entities.Claim;

public interface IClaim extends JpaRepository<Claim, Long> {
}
