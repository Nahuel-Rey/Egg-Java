package libreria.Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
//Se declara una variable emf de tipo EntityManagerFactory, que es utilizada para crear instancias de EntityManager.

    protected final EntityManagerFactory emf;
    protected final EntityManager em;

    //Se declara una variable em de tipo EntityManager, que representa el contexto de persistencia.
    //Es utilizado para interactuar con la base de datos a través de JPA (Java Persistence API)    
    public DAO() {
        /*
        Es el constructor de la clase DAO. Aquí se inicializan las variables emf y em al crear una instancia de DAO. 
        Persistence.createEntityManagerFactory("LibreriaPU") crea una instancia de EntityManagerFactory basada en la 
        configuración especificada en el archivo persistence.xml y etiquetada con el nombre "LibreriaPU".
         */
        emf = Persistence.createEntityManagerFactory("LibreriaPU");
        em = emf.createEntityManager();
        /*  
        Luego, emf.createEntityManager() crea una instancia de EntityManager a partir del EntityManagerFactory, 
        que representa el contexto de persistencia para interactuar con la base de datos.
         */
    }

    /*
  En el caso de la línea de código proporcionada, la transacción se inicia llamando al método "begin()",
    lo que permitirá que las operaciones de persistencia realizadas en el contexto de "em" se incluyan en esa transacción.
    Después de realizar las operaciones deseadas, se debe realizar un "commit"
    para aplicar los cambios permanentemente en la base de datos o un "rollback"
    para deshacer todas las operaciones realizadas dentro de la transacción
     */
    public void persistirEntidad(Object object) {
        try {
            em.getTransaction().begin(); //getTransaction()" es un método de la interfaz EntityManager que devuelve una instancia de la clase "EntityTransaction". La EntityTransaction representa una transacción en la base de datos con  .begin()se inicia una nueva transacción, lo que significa que todas las operaciones de persistencia que se realicen a partir de ese momento se agruparán dentro de esta transacción.
            em.persist(object); // es el método que realiza la operación de persistencia en la base de datos. Recibe como parámetro el objeto object que se desea persistir. Una vez que se llama a este método, la entidad se registra en el contexto de persistencia y está lista para ser sincronizada con la base de datos cuando se confirme la transacción
            em.getTransaction().commit();//confirma la transacción. Esto implica que las operaciones de persistencia que se han realizado (en este caso, la persistencia del objeto object) se aplicarán permanentemente en la base de datos.
        } catch (Exception e) {
            System.out.println("No se pudo cargar");
            if (em.getTransaction().isActive()) { //Se verifica si la transacción está activa. Esto es necesario porque, en caso de que se produzca una excepción, la transacción puede quedar en un estado inconsistente y aún activo.
                em.getTransaction().rollback(); //Si la transacción está activa y se produjo una excepción, se realiza un rollback(), lo que revierte todas las operaciones realizadas dentro de la transacción y vuelve al estado original antes de comenzar la transacción.
            }
        }
    }

    /*
    Este método se utiliza para actualizar el estado de una entidad existente en la base de datos. 
    Recibe un objeto object como parámetro y lo actualiza mediante em.merge(object). 
     */
    public void actualizarEstadoEntidad(Object object) {

        try {
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el estado");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
    }

    /*
    Este método permite eliminar una entidad de la base de datos.
    Recibe un objeto object como parámetro y lo elimina mediante em.remove(object)
     */
    public void EliminarEntidad(Object object) {

        try {
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
    }

}
