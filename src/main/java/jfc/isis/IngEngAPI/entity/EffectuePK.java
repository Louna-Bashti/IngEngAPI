package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class EffectuePK implements Serializable {
    @Column(name = "id_etud")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idEtud;
    @Column(name = "id_act")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idAct;
    @Column(name = "id_semestre")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idSemestre;

    public String getIdEtud() {
        return idEtud;
    }

    public void setIdEtud(String idEtud) {
        this.idEtud = idEtud;
    }

    public String getIdAct() {
        return idAct;
    }

    public void setIdAct(String idAct) {
        this.idAct = idAct;
    }

    public String getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(String idSemestre) {
        this.idSemestre = idSemestre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EffectuePK that = (EffectuePK) o;

        if (idEtud != null ? !idEtud.equals(that.idEtud) : that.idEtud != null) return false;
        if (idAct != null ? !idAct.equals(that.idAct) : that.idAct != null) return false;
        if (idSemestre != null ? !idSemestre.equals(that.idSemestre) : that.idSemestre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEtud != null ? idEtud.hashCode() : 0;
        result = 31 * result + (idAct != null ? idAct.hashCode() : 0);
        result = 31 * result + (idSemestre != null ? idSemestre.hashCode() : 0);
        return result;
    }
}
