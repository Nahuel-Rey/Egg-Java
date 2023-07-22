package libreria.Servicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import libreria.Entidades.Autor;
import libreria.Entidades.Editorial;
import libreria.Entidades.Libro;
import libreria.Persistencia.AutorDAO;
import libreria.Persistencia.EditorialDAO;
import libreria.Persistencia.LibroDAO;

public class LibroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private LibroDAO ldao = new LibroDAO();
    private AutorDAO adao = new AutorDAO();
    private EditorialDAO edao = new EditorialDAO();
    private AutorServicio as = new AutorServicio();
    private EditorialServicio es = new EditorialServicio();

    public void CargarLibro() {

        boolean opcion = true;
        
        do {
            Libro libro = new Libro();
            System.out.println("Ingrese el ISBN del libro");
            long isbn = leer.nextLong();
            libro.setISBN(isbn);

            System.out.println("Ingrese el titulo del libro");
            String titulo = leer.next();
            if (titulo.isEmpty()) {
                System.out.println("El titulo no puede estar vacio");
                continue;
            }
            libro.setTitulo(titulo);

            System.out.println("Ingrese el año de publicacion");
            Integer anio = leer.nextInt();
            if (anio > 2023) {
                System.out.println("Ingresa un año valido");
                continue;
            }
            libro.setAnio(anio);

            try {
                System.out.println("Cuantos ejemplares ingresan");
                int ejemplares = leer.nextInt();
                if (ejemplares <= 0) {
                    System.out.println("Ingrese un numero valido");
                    continue;
                }
                libro.setEjemplares(ejemplares);
                libro.setEjemplaresPrestados(0);
                libro.setEjemplaresRestantes(ejemplares);

            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero valido");
                leer.next();
                continue;
            }

            System.out.println("Ingrese el nombre del autor");
            String nombreAutor = leer.next();
            Autor autor = adao.buscarXnombre(nombreAutor);
            if (autor == null) {
                System.out.println("El autor no existe en la base de datos");
                System.out.println("Desea registrarlo? S/N");
                if (leer.next().equalsIgnoreCase("S")) {
                    Autor autorNuevo = new Autor();
                    autorNuevo.setNombre(nombreAutor);
                    autorNuevo.setAlta(true);
                    as.cargarXparametro(autorNuevo);
                } else {
                    continue;
                }
            }
            libro.setAutor(autor);

            System.out.println("Ingrese el nombre de la editorial");
            String nombreEditorial = leer.next();

            Editorial editorial = edao.buscarXnombre(nombreEditorial);
            if (editorial == null) {
                System.out.println("La editorial no existe en la base de datos");
                System.out.println("Desea registrarla? S/N");
                if (leer.next().equalsIgnoreCase("S")) {
                    Editorial editorialNueva = new Editorial();
                    editorialNueva.setNombre(nombreEditorial);
                    editorialNueva.setAlta(true);
                    es.cargarXparametro(editorialNueva);
                } else {
                    continue;
                }
            }
            libro.setEditorial(editorial);

            try {
                System.out.println("Desea cargar otro libro? S/N");
                opcion = leer.next().equalsIgnoreCase("S");
            } catch (Exception e) {
                System.out.println("Error al leer la opción. Se asume que desea cargar otro libro.");
                opcion = true;
            }
        } while (opcion);

        System.out.println("Libros cargados exitosamente");

    }
}
