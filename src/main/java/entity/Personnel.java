package entity;

import jakarta.persistence.*;

@Entity
public class Personnel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "prÉnom")
    private String prÉnom;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "identifiant")
    private String identifiant;
    @Basic
    @Column(name = "mdp")
    private String mdp;
    @Basic
    @Column(name = "rÔle")
    private String rÔle;

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

    public String getPrÉnom() {
        return prÉnom;
    }

    public void setPrÉnom(String prÉnom) {
        this.prÉnom = prÉnom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getrÔle() {
        return rÔle;
    }

    public void setrÔle(String rÔle) {
        this.rÔle = rÔle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personnel personnel = (Personnel) o;

        if (id != null ? !id.equals(personnel.id) : personnel.id != null) return false;
        if (nom != null ? !nom.equals(personnel.nom) : personnel.nom != null) return false;
        if (prÉnom != null ? !prÉnom.equals(personnel.prÉnom) : personnel.prÉnom != null) return false;
        if (email != null ? !email.equals(personnel.email) : personnel.email != null) return false;
        if (identifiant != null ? !identifiant.equals(personnel.identifiant) : personnel.identifiant != null)
            return false;
        if (mdp != null ? !mdp.equals(personnel.mdp) : personnel.mdp != null) return false;
        if (rÔle != null ? !rÔle.equals(personnel.rÔle) : personnel.rÔle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prÉnom != null ? prÉnom.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (identifiant != null ? identifiant.hashCode() : 0);
        result = 31 * result + (mdp != null ? mdp.hashCode() : 0);
        result = 31 * result + (rÔle != null ? rÔle.hashCode() : 0);
        return result;
    }
}
