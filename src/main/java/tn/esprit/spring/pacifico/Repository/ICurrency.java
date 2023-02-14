package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.pacifico.Entities.Currency;

public interface ICurrency extends JpaRepository<Currency, Long> {
}
