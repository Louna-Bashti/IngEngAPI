package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@IdClass(InscriptionPK.class)
public class Inscription {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_etud")
    private String idEtud;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nom_promo")
    private String nomPromo;
    @Basic
    @Column(name = "annÉescolaire")
    private String annÉescolaire;
    @Basic
    @Column(name = "dateinscription")
    private Date dateinscription;

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

    public String getAnnÉescolaire() {
        return annÉescolaire;
    }

    public void setAnnÉescolaire(String annÉescolaire) {
        this.annÉescolaire = annÉescolaire;
    }

    public Date getDateinscription() {
        return dateinscription;
    }

    public void setDateinscription(Date dateinscription) {
        this.dateinscription = dateinscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inscription that = (Inscription) o;

        if (idEtud != null ? !idEtud.equals(that.idEtud) : that.idEtud != null) return false;
        if (nomPromo != null ? !nomPromo.equals(that.nomPromo) : that.nomPromo != null) return false;
        if (annÉescolaire != null ? !annÉescolaire.equals(that.annÉescolaire) : that.annÉescolaire != null)
            return false;
        if (dateinscription != null ? !dateinscription.equals(that.dateinscription) : that.dateinscription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEtud != null ? idEtud.hashCode() : 0;
        result = 31 * result + (nomPromo != null ? nomPromo.hashCode() : 0);
        result = 31 * result + (annÉescolaire != null ? annÉescolaire.hashCode() : 0);
        result = 31 * result + (dateinscription != null ? dateinscription.hashCode() : 0);
        return result;
    }
}
