package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.pacifico.Entities.Operator;

public interface IOperator extends JpaRepository<Operator, Long> {
}
