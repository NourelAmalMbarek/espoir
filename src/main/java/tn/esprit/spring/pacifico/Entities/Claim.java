package tn.esprit.spring.pacifico.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Claim implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String object ;
    private String ClientName ;
    private String ClientPhone ;
    private String email ;


}
