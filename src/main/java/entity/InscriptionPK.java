package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class InscriptionPK implements Serializable {
    @Column(name = "id_etud")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idEtud;
    @Column(name = "nom_promo")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomPromo;

    public String getIdEtud() {
        return idEtud;
    }

    public void setIdEtud(String idEtud) {
        this.idEtud = idEtud;
    }

    public String getNomPromo() {
        return nomPromo;
    }

    public void setNomPromo(String nomPromo) {
        this.nomPromo = nomPromo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InscriptionPK that = (InscriptionPK) o;

        if (idEtud != null ? !idEtud.equals(that.idEtud) : that.idEtud != null) return false;
        if (nomPromo != null ? !nomPromo.equals(that.nomPromo) : that.nomPromo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEtud != null ? idEtud.hashCode() : 0;
        result = 31 * result + (nomPromo != null ? nomPromo.hashCode() : 0);
        return result;
    }
}
