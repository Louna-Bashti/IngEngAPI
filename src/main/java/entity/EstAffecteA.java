package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "est_affecte_a", schema = "public", catalog = "Ingenieur_Engage_test")
@IdClass(EstAffecteAPK.class)
public class EstAffecteA {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_ref")
    private String idRef;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_act")
    private String idAct;

    public String getIdRef() {
        return idRef;
    }

    public void setIdRef(String idRef) {
        this.idRef = idRef;
    }

    public String getIdAct() {
        return idAct;
    }

    public void setIdAct(String idAct) {
        this.idAct = idAct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstAffecteA that = (EstAffecteA) o;

        if (idRef != null ? !idRef.equals(that.idRef) : that.idRef != null) return false;
        if (idAct != null ? !idAct.equals(that.idAct) : that.idAct != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRef != null ? idRef.hashCode() : 0;
        result = 31 * result + (idAct != null ? idAct.hashCode() : 0);
        return result;
    }
}
