
package libreria.Servicios;

import java.util.Scanner;
import libreria.Entidades.Editorial;
import libreria.Persistencia.EditorialDAO;

public class EditorialServicio {
    
    private EditorialDAO edao = new EditorialDAO();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
     public void cargarEditorial() {

        boolean bucle = false;

        do {
            try {
                Editorial editorial = new Editorial();
                System.out.println("Ingrese el nombre de la editorial");
                String nombre = leer.next();

                editorial.setNombre(nombre);
                editorial.setAlta(true);

                Editorial editorialExistente = edao.buscarXnombre(nombre);

                if (editorialExistente != null) {
                    System.out.println("Ya existe esta editorial");
                    continue;
                }

                edao.persistirEditorial(editorial);
                System.out.println("Se guardo la editorial");

                System.out.println("Desea seguir cargando editoriales? : S/N");

                if (leer.next().equalsIgnoreCase("S")) {
                    bucle = true;
                }
            } catch (Exception e) {
                System.out.println("No se pudo cargar la editorial" + e.getMessage());
                e.printStackTrace();
            }
        } while (bucle);

    }
     
     public void editarEditorial(String nombre) {
        try {
           Editorial editorialActualizar = edao.buscarXnombre(nombre);

            System.out.println("Ingrese el nuevo nombre");
            String nombreNuevo = leer.next();

            editorialActualizar.setNombre(nombreNuevo);

            edao.actualizarEditorial(editorialActualizar);
        } catch (Exception e) {
            System.out.println("Error al editar la editorial: " + e.getMessage());
            e.printStackTrace();
        }
    }
     
     public void eliminarEditorial() {

        try {
            System.out.println("Ingrese el id del editorial a eliminar");
            Editorial editorialEliminar = edao.buscarXid(leer.nextInt());

            edao.EliminarEntidad(editorialEliminar);

        } catch (Exception e) {
            System.out.println("Error al eliminar la editorial: " + e.getMessage());
            e.printStackTrace();
        }
    }
     
     public void cargarXparametro(Editorial editorial) {
         edao.persistirEditorial(editorial);
         System.out.println("Editorial cargado exitosamente");
     }
}
