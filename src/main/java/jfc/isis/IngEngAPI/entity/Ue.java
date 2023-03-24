package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Ue {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "id_semestre")
    private String idSemestre;
    @Basic
    private String intitule;
    @Basic
    @Column(name = "description")
    private String description;

    @ManyToOne
    private Semestre semestre;

    @ManyToOne
    private Promotion promotion;

    @OneToOne
    private ChoixUE choix;
}
