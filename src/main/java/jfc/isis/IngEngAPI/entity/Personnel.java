package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class Personnel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String identifiant;
    private String mdp;
    private String role;

    @ManyToMany
    List<Activite> activites = new ArrayList<>();

}
