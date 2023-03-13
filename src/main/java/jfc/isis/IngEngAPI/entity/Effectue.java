package jfc.isis.IngEngAPI.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@IdClass(EffectuePK.class)
public class Effectue {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_etud")
    private String idEtud;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_act")
    private String idAct;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_semestre")
    private String idSemestre;
    @Basic
    @Column(name = "dateact")
    private Date dateact;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "nomreferents")
    private String nomreferents;
    @Basic
    @Column(name = "validation")
    private Boolean validation;
    @Basic
    @Column(name = "commentaireref")
    private String commentaireref;

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

    public Date getDateact() {
        return dateact;
    }

    public void setDateact(Date dateact) {
        this.dateact = dateact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomreferents() {
        return nomreferents;
    }

    public void setNomreferents(String nomreferents) {
        this.nomreferents = nomreferents;
    }

    public Boolean getValidation() {
        return validation;
    }

    public void setValidation(Boolean validation) {
        this.validation = validation;
    }

    public String getCommentaireref() {
        return commentaireref;
    }

    public void setCommentaireref(String commentaireref) {
        this.commentaireref = commentaireref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Effectue effectue = (Effectue) o;

        if (idEtud != null ? !idEtud.equals(effectue.idEtud) : effectue.idEtud != null) return false;
        if (idAct != null ? !idAct.equals(effectue.idAct) : effectue.idAct != null) return false;
        if (idSemestre != null ? !idSemestre.equals(effectue.idSemestre) : effectue.idSemestre != null) return false;
        if (dateact != null ? !dateact.equals(effectue.dateact) : effectue.dateact != null) return false;
        if (description != null ? !description.equals(effectue.description) : effectue.description != null)
            return false;
        if (nomreferents != null ? !nomreferents.equals(effectue.nomreferents) : effectue.nomreferents != null)
            return false;
        if (validation != null ? !validation.equals(effectue.validation) : effectue.validation != null) return false;
        if (commentaireref != null ? !commentaireref.equals(effectue.commentaireref) : effectue.commentaireref != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEtud != null ? idEtud.hashCode() : 0;
        result = 31 * result + (idAct != null ? idAct.hashCode() : 0);
        result = 31 * result + (idSemestre != null ? idSemestre.hashCode() : 0);
        result = 31 * result + (dateact != null ? dateact.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (nomreferents != null ? nomreferents.hashCode() : 0);
        result = 31 * result + (validation != null ? validation.hashCode() : 0);
        result = 31 * result + (commentaireref != null ? commentaireref.hashCode() : 0);
        return result;
    }
}
