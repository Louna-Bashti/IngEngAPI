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

public class Promotion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;

    @ManyToMany
    List<Activite> activites = new ArrayList<>();

    //relation OneToMany car il n'y a qu'une promotion par inscription mais plusieurs inscriptions par promotion
    @OneToMany
    List<Inscription> inscriptions = new ArrayList<>();

    @OneToMany
    List<Ue> syllabus = new ArrayList<>();
}
