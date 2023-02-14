package tn.esprit.spring.pacifico.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CallOfTender implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int reference ;
    @Temporal(TemporalType.DATE)
    private Date publicationDate ;
    private String designation ;
    private String customerName ;
    private String title ;
    private String Description ;
    @Temporal(TemporalType.DATE)
    private Date Deadline ;


}
