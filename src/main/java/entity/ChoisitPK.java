package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class ChoisitPK implements Serializable {
    @Column(name = "id_etud")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idEtud;
    @Column(name = "id_ue")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idUe;

    public String getIdEtud() {
        return idEtud;
    }

    public void setIdEtud(String idEtud) {
        this.idEtud = idEtud;
    }

    public String getIdUe() {
        return idUe;
    }

    public void setIdUe(String idUe) {
        this.idUe = idUe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChoisitPK choisitPK = (ChoisitPK) o;

        if (idEtud != null ? !idEtud.equals(choisitPK.idEtud) : choisitPK.idEtud != null) return false;
        if (idUe != null ? !idUe.equals(choisitPK.idUe) : choisitPK.idUe != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEtud != null ? idEtud.hashCode() : 0;
        result = 31 * result + (idUe != null ? idUe.hashCode() : 0);
        return result;
    }
}
