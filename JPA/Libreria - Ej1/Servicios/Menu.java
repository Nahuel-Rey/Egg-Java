package libreria.Servicios;

import java.util.Scanner;
import libreria.Servicios.AutorServicio;
import libreria.Servicios.LibroServicio;
import libreria.Servicios.EditorialServicio;

public class Menu {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected LibroServicio ls = new LibroServicio();
    protected AutorServicio as = new AutorServicio();
    protected EditorialServicio es = new EditorialServicio();

    public void menu() {
        int opcion;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("\033[1;32m BIENVENIDO A LA LIBRERIA.\033[0m");
            System.out.println("Ingrese la opcion deseada");

            System.out.println("1.Autor");
            System.out.println("2.Editorial");
            System.out.println("3.Libros");
            System.out.println("4.Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    menuAutor();
                    break;
                case 2:
                    menuEditorial();
                    break;
                case 3:
                    menuLibro();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 4);
    }

    public void menuAutor() {
        int opcion;
        do {
            System.out.println("------------------------------------------------------------------");
            System.out.println("\033[1;32m MENU AUTOR.\033[0m");
            System.out.println("Ingrese la opcion deseada");

            System.out.println("1.Cargar Autor");
            System.out.println("2.Editar Autor");
            System.out.println("3.Eliminar Autor");
            System.out.println("4.Lista de Autores");
            System.out.println("5.Buscar Autor por nombre");
            System.out.println("6.Buscar Autor por id");
            System.out.println("7.Salir");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    as.cargarAutor();
                    break;
                case 2:
                    as.editarAutor();
                    break;
                case 3:
                    as.eliminarAutor();
                    break;
                case 4:
                    as.listarAutores();
                    break;
                case 5:
                    as.buscarXNombre();
                    break;
                case 6:
                    as.buscarXId();
                    break;
                case 7:
                    System.out.println("Saliendo del MENU AUTOR");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 7);
    }

    public void menuEditorial() {
        int opcion;
        do {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("\033[1;32m MENU EDITORIAL.\033[0m");
            System.out.println("Ingrese la opcion deseada");

            System.out.println("1.Cargar Editorial");
            System.out.println("2.Editar Editorial");
            System.out.println("3.Eliminar Editorial");
            System.out.println("4.Lista de Editoriales");
            System.out.println("5.Buscar Editorial por id");
            System.out.println("6.Salir");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    es.cargarEditorial();
                    break;
                case 2:
                    es.editarEditorial();
                    break;
                case 3:
                    es.eliminarEditorial();
                    break;
                case 4:
                    es.listarEditoriales();
                    break;
                case 5:
                    es.buscarXId();
                    break;
                case 6:
                    System.out.println("Saliendo del MENU EDITORIAL");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 6);
    }

    public void menuLibro() {
        int opcion;
        do {
            System.out.println("\033[1;42m MENU LIBROS.\033[0m");
            System.out.println("Ingrese la opcion deseada");

            System.out.println("1.Cargar Libro");
            System.out.println("2.Editar Libro");
            System.out.println("3.Eliminar Libro");
            System.out.println("4.Listar Libros");
            System.out.println("5.Buscar Libro por ISBN");
            System.out.println("6.Buscar Lirbo por titulo");
            System.out.println("7.Buscar Libro por Autor");
            System.out.println("8.Buscar Libro por Editorial");
            System.out.println("9.Salir");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ls.CargarLibro();
                    break;
                case 2:
                    ls.editarLibro();
                    break;
                case 3:
                    ls.eliminarLibro();
                    break;
                case 4:
                    ls.listraLibros();
                    break;
                case 5:
                    ls.consultaISBN();
                    break;
                case 6:
                    ls.consultaTitulo();
                    break;
                case 7:
                    ls.consultaXAutor();
                    break;
                case 8:
                    ls.consultaXEditorial();
                    break;
                case 9:
                    System.out.println("Saliendo del MENU LIBRO");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 9);
    }
}
