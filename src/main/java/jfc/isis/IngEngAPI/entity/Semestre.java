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

public class Semestre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nompromo;
    private String numero;

    @OneToMany
    List<Realisation> realisationList = new ArrayList<>();

    @OneToMany
    List<Ue> ueList = new ArrayList<>();
}
