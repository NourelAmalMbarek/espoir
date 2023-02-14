package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.pacifico.Entities.CreditBill;

public interface ICreditBill extends JpaRepository<CreditBill, Long> {
}
