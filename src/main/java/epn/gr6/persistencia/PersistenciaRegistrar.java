package epn.gr6.persistencia;

import org.hibernate.Session;
import epn.gr6.modelo.*;

public class PersistenciaRegistrar {
    public static void registrarAutor(Autor autor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(autor);
        session.getTransaction().commit();
        session.close();
    }

    public static void registrarDireccion(Direccion direccion) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(direccion);
        session.getTransaction().commit();
        session.close();
    }

    public static void registrarGenero(Genero genero) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(genero);
        session.getTransaction().commit();
        session.close();
    }

    public static void registrarLibro(Libro libro) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(libro);
        session.getTransaction().commit();
        session.close();
    }
}
