package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;

@Entity
public class Activite {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "id_type")
    private String idType;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "nbpoints")
    private String nbpoints;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNbpoints() {
        return nbpoints;
    }

    public void setNbpoints(String nbpoints) {
        this.nbpoints = nbpoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activite activite = (Activite) o;

        if (id != null ? !id.equals(activite.id) : activite.id != null) return false;
        if (idType != null ? !idType.equals(activite.idType) : activite.idType != null) return false;
        if (nom != null ? !nom.equals(activite.nom) : activite.nom != null) return false;
        if (description != null ? !description.equals(activite.description) : activite.description != null)
            return false;
        if (nbpoints != null ? !nbpoints.equals(activite.nbpoints) : activite.nbpoints != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idType != null ? idType.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (nbpoints != null ? nbpoints.hashCode() : 0);
        return result;
    }
}
