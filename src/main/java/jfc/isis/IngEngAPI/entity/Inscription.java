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

public class Inscription {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String anneescolaire;
    private Date dateinscription;

}
