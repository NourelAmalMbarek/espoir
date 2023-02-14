package tn.esprit.spring.pacifico.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idCateg;
    private String name ;
    private int num;


}
