package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Activite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String idType;
    private String nom;
    private String description;
    private String nbpoints;
    private LocalDate dateValidation;
    private boolean validation;
    private String commentaire;

    @ManyToMany(mappedBy = "affectations")
    List<Personnel> personnels = new ArrayList<>();

    @ManyToOne
    private TypeActivite type;

    @ManyToMany(mappedBy = "activites")
    List<Promotion> promotions = new ArrayList<>();
}
