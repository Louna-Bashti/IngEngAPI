package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String nom;
    private String prenom;
    private String identifiant;
    private String mdp;
}
