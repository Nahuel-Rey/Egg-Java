package libreria.Persistencia;

import java.util.List;
import javax.persistence.Query;
import libreria.Entidades.Autor;

public class AutorDAO extends DAO {

    public void persistirAutor(Autor autor) {
        super.persistirEntidad(autor);
    }

    public void ActualizarAutor(Autor autor) {
        super.actualizarEstadoEntidad(autor);
    }

    public void EliminarAutor(Autor autor) {
        super.EliminarEntidad(autor);
    }

    public List listarAutor() {
        String jpql = "SELECT a FROM Autor a";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    public Autor buscarXnombre(String nombre) {
        String jpql = "SELECT a FROM Autor a WHERE a.nombre = :nombre";

        return em.createQuery(jpql, Autor.class)
                .setParameter("nombre", nombre)
                .getSingleResult();
    }
    
    public Autor buscarXid(Integer id) {
        return em.find(Autor.class, id);
    }
    
}
