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
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String address;
    private String firstname;
    private String lastaname;
    private String mailAddress;
    private int phoneNumber;
    private String  password;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;


}
