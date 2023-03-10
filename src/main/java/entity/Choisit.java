package entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@IdClass(ChoisitPK.class)
public class Choisit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_etud")
    private String idEtud;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_ue")
    private String idUe;
    @Basic
    @Column(name = "datechoix")
    private Date datechoix;

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

    public Date getDatechoix() {
        return datechoix;
    }

    public void setDatechoix(Date datechoix) {
        this.datechoix = datechoix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Choisit choisit = (Choisit) o;

        if (idEtud != null ? !idEtud.equals(choisit.idEtud) : choisit.idEtud != null) return false;
        if (idUe != null ? !idUe.equals(choisit.idUe) : choisit.idUe != null) return false;
        if (datechoix != null ? !datechoix.equals(choisit.datechoix) : choisit.datechoix != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEtud != null ? idEtud.hashCode() : 0;
        result = 31 * result + (idUe != null ? idUe.hashCode() : 0);
        result = 31 * result + (datechoix != null ? datechoix.hashCode() : 0);
        return result;
    }
}
