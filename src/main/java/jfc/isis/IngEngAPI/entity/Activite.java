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
public class Activite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String idType;
    private String nom;
    private String description;
    private String nbpoints;

    @ManyToMany(mappedBy = "activites")
    List<Personnel> personnels = new ArrayList<>();
}
