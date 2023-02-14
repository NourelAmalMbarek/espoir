package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.pacifico.Entities.Offer;

public interface IOffer extends JpaRepository<Offer, Long> {
}
