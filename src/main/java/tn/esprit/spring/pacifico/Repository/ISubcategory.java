package tn.esprit.spring.pacifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.pacifico.Entities.Subcategory;

public interface ISubcategory extends JpaRepository<Subcategory, Long> {
}
