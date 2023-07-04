package epn.gr6;


import epn.gr6.modelo.*;
import epn.gr6.persistencia.PersistenciaRegistrar;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        Autor autor1 = new Autor("A001","Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002","J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A003","Haruki Murakami", "Japonés");

        // Ejemplos de instancias de Libro
        Libro libro1 = new Libro("L001","Cien años de soledad");
        Libro libro2 = new Libro("L002","Harry Potter y la piedra filosofal");
        Libro libro3 = new Libro("L003","Tokio Blues");
        Libro libro4 = new Libro("L004","Harry Potter y la cámara secreta");

        // Ejemplos de instancias de Genero
        Genero genero1 = new Genero("G001","Acción", "Películas de alto impacto y emocionantes");
        Genero genero2 = new Genero("G002","Comedia", "Películas divertidas y humorísticas");
        Genero genero3 = new Genero("G003","Drama", "Películas con temas emotivos y serios");

        // Ejemplos de instancias de Direccion
        Direccion direccion1 = new Direccion("D001","Colombia", "Aracataca");
        Direccion direccion2 = new Direccion("D002","Reino Unido", "YAte");
        Direccion direccion3 = new Direccion("D003","Japón", "Kioto");


        List<Genero> generos1 = new ArrayList<>();
        generos1.add(genero1);
        generos1.add(genero3);

        List<Genero> generos2 = new ArrayList<>();
        generos2.add(genero3);

        List<Genero> generos3 = new ArrayList<>();
        generos3.add(genero1);

        autor1.setDireccion(direccion1);
        autor2.setDireccion(direccion2);
        autor3.setDireccion(direccion3);

        libro1.setGeneros(generos2);
        libro2.setGeneros(generos1);
        libro3.setGeneros(generos3);

        PersistenciaRegistrar.registrarDireccion(direccion1);
        PersistenciaRegistrar.registrarDireccion(direccion2);
        PersistenciaRegistrar.registrarDireccion(direccion3);

        PersistenciaRegistrar.registrarGenero(genero1);
        PersistenciaRegistrar.registrarGenero(genero2);
        PersistenciaRegistrar.registrarGenero(genero3);

        PersistenciaRegistrar.registrarAutor(autor1);
        PersistenciaRegistrar.registrarAutor(autor2);
        PersistenciaRegistrar.registrarAutor(autor3);

        libro1.setAutor(autor1);
        libro2.setAutor(autor2);
        libro3.setAutor(autor3);
        libro4.setAutor(autor2);

        PersistenciaRegistrar.registrarLibro(libro1);
        PersistenciaRegistrar.registrarLibro(libro2);
        PersistenciaRegistrar.registrarLibro(libro3);
        PersistenciaRegistrar.registrarLibro(libro4);

        // Imprimir información de los autores
        System.out.println("Información de los autores:");
        System.out.println("Autor 1: " + autor1.getNombre() + " (" + autor1.getDireccion().getPais() + ")");
        System.out.println("Autor 2: " + autor2.getNombre() + " (" + autor2.getDireccion().getPais() + ")");
        System.out.println("Autor 3: " + autor3.getNombre() + " (" + autor3.getDireccion().getPais() + ")");
        System.out.println("");

        System.out.println("Libro 1: " + libro1.getTitulo() + " Autor:" + libro1.getAutor().getNombre() );
        System.out.println("Libro 2: " + libro2.getTitulo() + " Autor:" + libro2.getAutor().getNombre());
        System.out.println("Libro 3: " + libro3.getTitulo() + " Autor:" + libro3.getAutor().getNombre());
        System.out.println("Libro 4: " + libro4.getTitulo() + " Autor:" + libro4.getAutor().getNombre());
        System.out.println("");

        System.out.println("Libro 1: " + libro1.getTitulo() + " Géneros:" + libro1.getGeneros().get(0).getNombre());
        System.out.println("Libro 2: " + libro2.getTitulo() + " Géneros:" + libro2.getGeneros().get(0).getNombre() +
                " " + libro2.getGeneros().get(1).getNombre());
    }
}
