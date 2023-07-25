package libreria.Servicios;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import libreria.Entidades.Autor;
import libreria.Entidades.Editorial;
import libreria.Entidades.Libro;
import libreria.Persistencia.AutorDAO;
import libreria.Persistencia.EditorialDAO;
import libreria.Persistencia.LibroDAO;

public class LibroServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private LibroDAO ldao = new LibroDAO();
    private AutorDAO adao = new AutorDAO();
    private EditorialDAO edao = new EditorialDAO();
    private AutorServicio as = new AutorServicio();
    private EditorialServicio es = new EditorialServicio();

    public void CargarLibro() {

        boolean opcion = true;

        do {
            Libro libro = new Libro();

            libro.setAlta(true);

            System.out.println("Ingrese el ISBN del libro");
            long isbn = leer.nextLong();
            Libro libroExistente = ldao.buscarPorISBN(isbn);
            if (libroExistente != null) {
                System.out.println("El libro ya existe en la base de datos");
                continue;
            }
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
            List<Autor> autores = adao.buscarXnombre(nombreAutor);
            if (!autores.isEmpty()) {
                Autor autorExistente = autores.get(0);
                libro.setAutor(autorExistente);
            } else {
                System.out.println("El autor no existe en la base de datos");
                System.out.println("Desea registrarlo? S/N");
                if (leer.next().equalsIgnoreCase("S")) {
                    Autor autorNuevo = new Autor();
                    autorNuevo.setNombre(nombreAutor);
                    autorNuevo.setAlta(true);
                    as.cargarXparametro(autorNuevo);
                    libro.setAutor(autorNuevo);
                } else {
                    libro.setAutor(null);
                }
            }

            System.out.println("Ingrese el nombre de la editorial");
            String nombreEditorial = leer.next();

            List<Editorial> editoriales = edao.buscarXnombre(nombreEditorial);
            if (!editoriales.isEmpty()) {
                Editorial editorialExistente = editoriales.get(0);
                libro.setEditorial(editorialExistente);
            } else {
                System.out.println("La editorial no existe en la base de datos");
                System.out.println("Desea registrarla? S/N");
                if (leer.next().equalsIgnoreCase("S")) {
                    Editorial editorialNueva = new Editorial();
                    editorialNueva.setNombre(nombreEditorial);
                    editorialNueva.setAlta(true);
                    es.cargarXparametro(editorialNueva);
                    libro.setEditorial(editorialNueva);
                } else {
                    libro.setEditorial(null);
                }
            }
            if (libro.getAutor() == null || libro.getEditorial() == null) {
                System.out.println("El libro debe tener un autor y una editorial que esten en la base de datos.");
                continue;
            }
            ldao.persisitirEntidad(libro);
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

    public void editarLibro() {
        try {
            System.out.println("Ingrese el nombre el ISBN del libro a editar");
            Libro libroEditar = ldao.buscarPorISBN(leer.nextLong());
            if (libroEditar != null) {
                boolean editarMas = true;

                do {
                    System.out.println("Que desea editar?");
                    System.out.println("1. ISBN");
                    System.out.println("2. Titulo");
                    System.out.println("3. Año");
                    System.out.println("4. Ejemplares");
                    System.out.println("5. Autor");
                    System.out.println("6. Editorial");
                    System.out.println("7. Salir");

                    int opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese el  ISBN");
                            libroEditar.setISBN(leer.nextLong());
                            break;
                        case 2:
                            System.out.println("Ingrese el titulo");
                            libroEditar.setTitulo(leer.next());
                            break;
                        case 3:
                            System.out.println("Ingrese el año");
                            int nuevoAnio = leer.nextInt();
                            if (nuevoAnio > 2023) {
                                System.out.println("Ingresa un año válido");
                                continue;
                            }
                            libroEditar.setAnio(nuevoAnio);
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad de ejemplares");
                            int nuevoEjemplares = leer.nextInt();
                            if (nuevoEjemplares <= 0) {
                                System.out.println("Ingrese un número válido");
                                continue;
                            }
                            libroEditar.setEjemplares(nuevoEjemplares);
                            libroEditar.setEjemplaresRestantes(nuevoEjemplares - libroEditar.getEjemplaresPrestados());

                            break;
                        case 5:
                            System.out.println("Ingrese el autor");
                            String nombreAutor = leer.next();
                            List<Autor> autores = adao.buscarXnombre(nombreAutor);
                            if (!autores.isEmpty()) {
                                Autor autorExistente = autores.get(0);
                                libroEditar.setAutor(autorExistente);
                            } else {
                                System.out.println("El autor no existe en la base de datos");
                                System.out.println("Desea registrarlo? S/N");
                                if (leer.next().equalsIgnoreCase("S")) {
                                    Autor autorNuevo = new Autor();
                                    autorNuevo.setNombre(nombreAutor);
                                    autorNuevo.setAlta(true);
                                    as.cargarXparametro(autorNuevo);
                                    libroEditar.setAutor(autorNuevo);
                                } else {
                                    System.out.println("No se ha registrado un autor nuevo");
                                }
                            }
                            break;
                        case 6:
                            System.out.println("Ingrese la editorial");
                            String nombreEditorial = leer.next();

                            List<Editorial> editoriales = edao.buscarXnombre(nombreEditorial);
                            if (!editoriales.isEmpty()) {
                                Editorial editorialExistente = editoriales.get(0);
                                libroEditar.setEditorial(editorialExistente);
                            } else {
                                System.out.println("La editorial no existe en la base de datos");
                                System.out.println("Desea registrarla? S/N");
                                if (leer.next().equalsIgnoreCase("S")) {
                                    Editorial editorialNueva = new Editorial();
                                    editorialNueva.setNombre(nombreEditorial);
                                    editorialNueva.setAlta(true);
                                    es.cargarXparametro(editorialNueva);
                                    libroEditar.setEditorial(editorialNueva);
                                } else {
                                    System.out.println("No se ha registrado una editorial nueva");
                                }
                            }
                            break;
                        case 7:
                            editarMas = false;
                            break;
                        default:
                            System.out.println("Opción inválida, intente nuevamente.");
                            break;
                    }

                    System.out.println("Desea editar algo mas? S/N");
                    String respuesta = leer.next();
                    editarMas = respuesta.equalsIgnoreCase("S");
                    ldao.actualizarEstadoEntidad(libroEditar);
                } while (editarMas);
                System.out.println("El libro ha sido editado correctamente.");
            } else {
                System.out.println("El libro con el ISBN ingresado no existe en la base de datos.");
            }

        } catch (Exception e) {
            System.out.println("Error al editar la editorial: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void eliminarLibro() {

        try {
            System.out.println("Ingrese el ISBN del libro que desea eliminar.");
            Libro libroEliminar = ldao.buscarPorISBN(leer.nextLong());
            leer.next();
            ldao.eliminarLibro(libroEliminar);
            System.out.println("\033[1;32m Se elimino el libro exitosamente.\033[0m");
        } catch (Exception e) {
            System.out.println("\033[1;31m Error al eliminar.\033[0m");
            System.out.println(e.getMessage());
        }

    }

    public void listraLibros() {
        List<Libro> libros = ldao.consultaLibro();
        for (Libro libro : libros) {
            System.out.println("ISBN: " + libro.getISBN() + " | Titulo: " + libro.getTitulo() + " | Año:" + libro.getAnio() + " | Ejemplares: " + libro.getEjemplares() + " | " + "\033[1;32m"+libro.getAutor()+".\033[0m" + " | " + "\033[1;32m"+libro.getEditorial()+".\033[0m()");
        }
    }

    public void consultaISBN() {
        System.out.println("Ingrese el ISBN del libro");
        Libro libro = ldao.buscarPorISBN(leer.nextLong());
        System.out.println(libro.toString());
    }

    public void consultaTitulo() {
        System.out.println("Ingrese el titulo del libro");
        Libro libro = ldao.buscarXtitulo(leer.next());
        System.out.println(libro.toString());
    }

    public void consultaXAutor() {
        System.out.println("Ingrese el nombre del Autor");
        List<Libro> libros = ldao.buscarXautor(leer.next());
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }

    public void consultaXEditorial() {
        System.out.println("Ingrese el nombre de la Editorial");
        List<Libro> libros = ldao.buscarXeditorial(leer.next());
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }
}
