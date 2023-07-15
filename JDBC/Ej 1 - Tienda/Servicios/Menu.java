package tienda.Servicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import tienda.Persistencia.fabricanteDAO;
import tienda.Persistencia.productoDAO;

public class Menu {

    productoDAO pdao = new productoDAO();
    fabricanteDAO fdao = new fabricanteDAO();
    ProductoService ps = new ProductoService(pdao);
    FabricanteService fs = new FabricanteService(fdao);
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menuPricipal() throws Exception {
        int opcion = 0;

        do {
            try {

                System.out.println("*****  MENU PRINCIPAL  *****");
                System.out.println("* 1.- Fabricantes          *");
                System.out.println("* 2.- Productos            *");
                System.out.println("* 3.- Salir                *");
                System.out.println("****************************");

                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        menuFabricantes();
                        break;
                    case 2:
                        menuProductos();
                        break;
                    case 3:
                        System.out.println("ADIOS");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 3);

    }

    public void menuFabricantes() {
        int opcion = 0;
        do {
            try {
                System.out.println("*****  MENU FABRICANTES  *****");
                System.out.println("* 1.- Nuevo Fabricante       *");
                System.out.println("* 2.- Listar Fabricantes     *");
                System.out.println("* 3.- Salir                  *");
                System.out.println("******************************");

                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        fs.cargarFabricante();
                        break;
                    case 2:
                        fs.mostrarFabricantes();
                        break;
                    case 3:
                        System.out.println("ADIOS");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
            }
        } while (opcion != 3);
    }

    public void menuProductos() throws Exception {
        int opcion = 0;

        do {
            try {

                System.out.println("********  MENU PRODUCTOS  ********");
                System.out.println("* 1.- Nuevo Producto             *");
                System.out.println("* 2.- Listar Productos           *");
                System.out.println("* 3.- Listar Productos por nombre           *");
                System.out.println("* 4.- Listar por nombre y precio *");
                System.out.println("* 5.- Listar por Rango de precio *");
                System.out.println("* 6.- Buscar producto por nombre         *");
                System.out.println("* 7.- Listar producto mas barato *");
                System.out.println("* 8.- Editar Producto            *");
                System.out.println("* 9.- Salir                      *");
                System.out.println("**********************************");

                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        ps.cargarProducto();
                        break;
                    case 2:
                        ps.listarProducto();
                        break;
                    case 3:
                        ps.listarxNombre();
                        break;
                    case 4:
                        ps.listarxNombrePrecio();
                        break;
                    case 5:
                        ps.listarxRango();
                        break;
                    case 6:
                        ps.buscarxNombre();
                        break;
                    case 7:
                        ps.masBarato();
                        break;
                    case 8:
                        ps.editarProducto();
                        break;
                    case 9:
                        System.out.println("ADIOS");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 8);
    }
//CONSTRUIDO EN BASE AL CODIGO DE https://github.com/lucast086//
}
