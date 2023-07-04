package epn.gr6.modelo;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "pais")
    private String pais;
    @Column(name = "ciudad")
    private String ciudad;

    public Direccion(){

    }

    public Direccion(String id, String pais, String ciudad) {
        this.id = id;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
