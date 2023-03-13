package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "est_restreinte_a", schema = "public", catalog = "Ingenieur_Engage_test")
@IdClass(EstRestreinteAPK.class)
public class EstRestreinteA {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nom")
    private String nom;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstRestreinteA that = (EstRestreinteA) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        return result;
    }
}
