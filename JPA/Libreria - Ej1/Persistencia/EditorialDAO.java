
package libreria.Persistencia;

import java.util.List;
import javax.persistence.Query;
import libreria.Entidades.Editorial;


public class EditorialDAO extends DAO{
    
    public void persistirEditorial(Editorial editorial) {
        super.persistirEntidad(editorial);
    }
    
    public void actualizarEditorial(Editorial editorial) {
        super.actualizarEstadoEntidad(editorial);
    }
    
    public void eliminarEditorial(Editorial editorial) {
        super.EliminarEntidad(editorial);
    }
    
    public List listarEditorial(Editorial editorial) {
        String jpql="SELECT e FROM Editorial e";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }
    
    
}
