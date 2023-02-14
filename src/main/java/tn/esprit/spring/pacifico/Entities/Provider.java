package tn.esprit.spring.pacifico.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Provider implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String  companyName;
    private String nationality;
    private String address;
    private String firstname;
    private String lastaname;
    private String mailAddress;
    private String phoneNumber;
    private String  password;
    private String identifyCard;
    private String patent;
    private String domain;


}
