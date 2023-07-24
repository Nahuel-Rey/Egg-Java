package libreria.Persistencia;

import java.util.List;
import javax.persistence.Query;
import libreria.Entidades.Editorial;

public class EditorialDAO extends DAO {

    public void persistirEditorial(Editorial editorial) {
        super.persistirEntidad(editorial);
    }

    public void actualizarEditorial(Editorial editorial) {
        super.actualizarEstadoEntidad(editorial);
    }

    public void eliminarEditorial(Editorial editorial) {
        super.EliminarEntidad(editorial);
    }

    public List listarEditorial() {
        String jpql = "SELECT e FROM Editorial e";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    public Editorial buscarXid(Integer id) {
        return em.find(Editorial.class, id);
    }

    public List buscarXnombre(String nombre) {
        String jpql = "SELECT e FROM Editorial e WHERE e.nombre LIKE  :nombre";

        return em.createQuery(jpql, Editorial.class)
                .setParameter("nombre", "%"+nombre+"%")
                .getResultList();
    }

}
