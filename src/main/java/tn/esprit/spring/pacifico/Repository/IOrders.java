package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.pacifico.Entities.Orders;

public interface IOrders extends JpaRepository<Orders, Long> {
}
