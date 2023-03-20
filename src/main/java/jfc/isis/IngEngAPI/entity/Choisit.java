package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Choisit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date datechoix;
}
