package libreria.Persistencia;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import libreria.Entidades.Libro;

public class LibroDAO extends DAO {

    public void persisitirEntidad(Libro libro) {
        super.persistirEntidad(libro);
    }

    public void actualizarEstadoEntidad(Libro libro) {
        super.actualizarEstadoEntidad(libro);
    }

    public List consultaLibro() {
        String jpql = "SELECT l FROM Libro l";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    public Libro buscarXtitulo(String titulo) {
        String jpql = "SELECT l FROM Libro l WHERE l.titulo LIKE :titulo";
        Query query = em.createQuery(jpql);
        query.setParameter("titulo", titulo);
        try {
            return (Libro) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    public Libro buscarPorISBN(Long isbn) {
        return em.find(Libro.class, isbn);
    }

  public List buscarXautor(String nombre) {
    String jpql = "SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre";
    try {
        return em.createQuery(jpql)
                .setParameter("nombre", nombre)
                .getResultList();
    } catch (NoResultException ex) {
        return null;
    }
}

    
     public List buscarXeditorial(String nombre) {
        String jpql = "SELECT l FROM Libro l  WHERE l.editorial.nombre LIKE :nombre";

        try {
            return em.createQuery(jpql)
                    .setParameter("nombre", nombre)
                    .getResultList();

        } catch (NoResultException ex) {
            return null;
        }
    }
}
