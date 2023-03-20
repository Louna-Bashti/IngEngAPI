package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Effectue {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date dateact;

    private String description;
    private String nomreferents;
    private Boolean validation;
    private String commentaireref;
}
