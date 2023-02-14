package tn.esprit.spring.pacifico.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subcategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String Name ;


}
