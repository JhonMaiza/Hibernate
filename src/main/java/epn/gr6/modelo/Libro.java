package epn.gr6.modelo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "titulo")
    private String titulo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @JoinTable(
            name = "libro_genero",
            joinColumns = @JoinColumn(name = "id_libro", nullable = false),
            inverseJoinColumns = @JoinColumn(name="id_genero", nullable = false)
    )
    @ManyToMany(cascade =  CascadeType.ALL)
    private List<Genero> generos;

    public Libro() {
    }

    public Libro(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }
}
