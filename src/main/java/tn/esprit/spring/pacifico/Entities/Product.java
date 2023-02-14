package tn.esprit.spring.pacifico.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private int reference ;
    private float price ;
    private String description ;
    private String name ;
    private String image ;
    private int quantity;
    private float promo ;
    private float vat ;
    private String manufacturer;


}
