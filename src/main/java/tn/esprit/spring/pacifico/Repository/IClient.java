package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.pacifico.Entities.Client;

public interface IClient extends JpaRepository<Client, Long> {
}
