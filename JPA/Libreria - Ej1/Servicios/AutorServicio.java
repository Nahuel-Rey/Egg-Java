package libreria.Servicios;

import java.util.Scanner;
import libreria.Entidades.Autor;
import libreria.Persistencia.AutorDAO;

public class AutorServicio {

    private AutorDAO adao = new AutorDAO();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarAutor() {

        boolean bucle = false;

        do {
            try {
                Autor autor = new Autor();
                System.out.println("Ingrese el nombre del autor");
                String nombre = leer.next();

                autor.setNombre(nombre);
                autor.setAlta(true);

                Autor autorExistente = adao.buscarXnombre(nombre);

                if (autorExistente != null) {
                    System.out.println("Ya existe este autor");
                    continue;
                }

                adao.persistirAutor(autor);
                System.out.println("Se guardo el autor");

                System.out.println("Desea seguir cargando autores? : S/N");

                if (leer.next().equalsIgnoreCase("S")) {
                    bucle = true;
                }
            } catch (Exception e) {
                System.out.println("No se pudo cargar al autor" + e.getMessage());
                e.printStackTrace();
            }
        } while (bucle);

    }

    public void editarAutor(String nombre) {
        try {
            Autor autorActualizar = adao.buscarXnombre(nombre);

            System.out.println("Ingrese el nuevo nombre");
            String nombreNuevo = leer.next();

            autorActualizar.setNombre(nombreNuevo);

            adao.ActualizarAutor(autorActualizar);
        } catch (Exception e) {
            System.out.println("Error al editar autor: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void eliminarAutor() {

        try {
            System.out.println("Ingrese el id del autor a eliminar");
            Autor autorEliminar = adao.buscarXid(leer.nextInt());

            adao.EliminarAutor(autorEliminar);

        } catch (Exception e) {
            System.out.println("Error al eliminar el autor: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
