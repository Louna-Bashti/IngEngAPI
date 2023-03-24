package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany
    List<Realisation> realisationListe = new ArrayList<>();

    @OneToMany
    List<Inscription> inscriptionListe = new ArrayList<>();

    @OneToMany
    List<ChoixUE> choixUEListe = new ArrayList<>();


}
