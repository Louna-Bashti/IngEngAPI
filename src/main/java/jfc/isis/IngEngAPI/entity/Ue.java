package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;

@Entity
public class Ue {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "id_semestre")
    private String idSemestre;
    @Basic
    @Column(name = "intitulÉ")
    private String intitulÉ;
    @Basic
    @Column(name = "description")
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(String idSemestre) {
        this.idSemestre = idSemestre;
    }

    public String getIntitulÉ() {
        return intitulÉ;
    }

    public void setIntitulÉ(String intitulÉ) {
        this.intitulÉ = intitulÉ;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ue ue = (Ue) o;

        if (id != null ? !id.equals(ue.id) : ue.id != null) return false;
        if (idSemestre != null ? !idSemestre.equals(ue.idSemestre) : ue.idSemestre != null) return false;
        if (intitulÉ != null ? !intitulÉ.equals(ue.intitulÉ) : ue.intitulÉ != null) return false;
        if (description != null ? !description.equals(ue.description) : ue.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idSemestre != null ? idSemestre.hashCode() : 0);
        result = 31 * result + (intitulÉ != null ? intitulÉ.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
