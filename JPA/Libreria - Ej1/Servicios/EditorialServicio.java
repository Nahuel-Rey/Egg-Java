package libreria.Servicios;

import java.util.Collection;
import java.util.List;
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

                List<Editorial> editoriales = edao.buscarXnombre(nombre);
                if (!editoriales.isEmpty()) {
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

    public void editarEditorial() {
        try {
            System.out.println("Ingrese el nombre de la editorial a editar");
            String nombre = leer.next();
            List<Editorial> editoriales = edao.buscarXnombre(nombre);

            for (Editorial editorial : editoriales) {
                if (editorial.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Ingrese el nuevo nombre");
                    editorial.setNombre(leer.next());
                    editorial.setAlta(true);
                    edao.actualizarEditorial(editorial);
                } else {
                    System.out.println("Editorial no encontrado");
                    continue;
                }
            }

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
//metodo solo utilizado internamente por libroServicio.
    public void cargarXparametro(Editorial editorial) {
        edao.persistirEditorial(editorial);
        System.out.println("Editorial cargado exitosamente");
    }
    public void listarEditoriales() {

        Collection<Editorial> editoriales = edao.listarEditorial();
        for (Editorial editoriale : editoriales) {
            System.out.println(editoriale.toString());
        }
    }
    
    public void buscarXId() {
        System.out.println("Ingrese el id del editorial");
        Editorial editorial = edao.buscarXid(leer.nextInt());
        System.out.println(editorial.toString());
    }
}
