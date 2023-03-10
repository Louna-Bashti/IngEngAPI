package entity;

import jakarta.persistence.*;

@Entity
public class Semestre {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "nompromo")
    private String nompromo;
    @Basic
    @Column(name = "numero")
    private String numero;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNompromo() {
        return nompromo;
    }

    public void setNompromo(String nompromo) {
        this.nompromo = nompromo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Semestre semestre = (Semestre) o;

        if (id != null ? !id.equals(semestre.id) : semestre.id != null) return false;
        if (nompromo != null ? !nompromo.equals(semestre.nompromo) : semestre.nompromo != null) return false;
        if (numero != null ? !numero.equals(semestre.numero) : semestre.numero != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nompromo != null ? nompromo.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        return result;
    }
}
