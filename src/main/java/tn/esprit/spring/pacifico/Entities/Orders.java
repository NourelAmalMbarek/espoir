package tn.esprit.spring.pacifico.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Orders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Temporal(TemporalType.DATE)
    private Date OrderDate ;

    @Enumerated(EnumType.STRING)
    private Status status ;

    private int numOrder ;
    private String deliveryAddress ;
    private int price ;

}
