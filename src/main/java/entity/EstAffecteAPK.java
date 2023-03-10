package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class EstAffecteAPK implements Serializable {
    @Column(name = "id_ref")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idRef;
    @Column(name = "id_act")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

        EstAffecteAPK that = (EstAffecteAPK) o;

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
