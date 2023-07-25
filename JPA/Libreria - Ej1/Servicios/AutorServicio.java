package libreria.Servicios;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import libreria.Entidades.Autor;
import libreria.Persistencia.AutorDAO;

public class AutorServicio {

    private AutorDAO adao = new AutorDAO();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarAutor() {

        boolean bucle;

        do {
            bucle = false;
            try {
                Autor autor = new Autor();
                System.out.println("Ingrese el nombre del autor");
                String nombre = leer.next();

                autor.setNombre(nombre);
                autor.setAlta(true);

                List<Autor> autores = adao.buscarXnombre(nombre);
                if (!autores.isEmpty()) {
                    System.out.println("Ya existe el autor");
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

    public void editarAutor() {
        try {
            System.out.println("Ingrese el nombre del autor a editar");
            String nombre = leer.next();

            List<Autor> autores = adao.buscarXnombre(nombre);
            for (Autor autor : autores) {
                if (autor.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Ingrese el nuevo nombre");
                    autor.setNombre(leer.next());
                    autor.setAlta(true);
                    adao.ActualizarAutor(autor);
                } else {
                    System.out.println("Autor no encontrado");
                    continue;
                }
            }
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

    public void listarAutores() {

        Collection<Autor> autores = adao.listarAutor();
        for (Autor autore : autores) {
            System.out.println("Id: " + autore.getId() + " | Nombre: " + autore.getNombre() + " | Alta: " + autore.getAlta());
        }
    }
//metodo solo utilizado internamente por libroServicio.

    public void cargarXparametro(Autor autor) {
        try {
            adao.persistirAutor(autor);
            System.out.println("Autor cargado Exitosamente");
        } catch (Exception e) {
            System.out.println("No se pudo cargar al autor" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void buscarXNombre() {
        System.out.println("Ingrese el nombre del autor");
        List<Autor> autores = adao.buscarXnombre(leer.next());
        if (!autores.isEmpty()) {
            Autor autorExistente = autores.get(0);
            System.out.println(autorExistente.toString());
        }
    }

    public void buscarXId() {
        System.out.println("Ingrese el id del autor");
        Autor autor = adao.buscarXid(leer.nextInt());
        System.out.println(autor.toString());
    }
}
