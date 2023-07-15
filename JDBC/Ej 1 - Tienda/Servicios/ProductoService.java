package tienda.Servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.Entidades.Producto;
import tienda.Persistencia.productoDAO;

public class ProductoService {

    productoDAO pDAO;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ProductoService(productoDAO pDAO) {
        this.pDAO = pDAO;
    }

    public void listarProducto() throws Exception {
        try {
            Collection<Producto> listaProducto = pDAO.listarProducto();

            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("** COD - NOMBRE - PRECIO - COD_FABRICANTE **");
            for (Producto producto : listaProducto) {
                System.out.println(producto.toString());
            }
            System.out.println("--------");
        } catch (Exception e) {
            throw e;
        }
    }

    /*a) Lista el nombre de todos los productos que hay en la tabla producto.*/
    public void listarxNombre() throws Exception {
        try {
            Collection<Producto> listaProducto = pDAO.listarProducto();

            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("** NOMBRE**");
            for (Producto producto : listaProducto) {
                System.out.println(" " + producto.getNombre() + " " + " ");
            }

            System.out.println("-----------------");

        } catch (Exception e) {
            throw e;
        }
    }
//b) Lista los nombres y los precios de todos los productos de la tabla producto.

    public void listarxNombrePrecio() throws Exception {
        try {
            Collection<Producto> listaProducto = pDAO.listarProducto();

            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("** NOMBRE - PRECIO**");
            for (Producto producto : listaProducto) {
                System.out.println(" PRDUCTO = " + producto.getNombre() + " | PRECIO= "+ producto.getPrecio() + " ");
            }

            System.out.println("--------------------");

        } catch (Exception e) {
            throw e;
        }
    }
//c) Listar aquellos productos que su precio est� entre 120 y 202.

    public void listarxRango() throws Exception {
        try {

            System.out.println("Ingrese precio minimo");
            double num1 = leer.nextDouble();

            System.out.println("Ingrese precio maximo");
            double num2 = leer.nextDouble();

            if (num1 < 0) {
                throw new Exception("valor nulo");
            }

            if (num2 < 0) {
                throw new Exception("valor nulo");
            }

            Collection<Producto> listaProducto = pDAO.listarxRango(num1, num2);

            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("**CODIGO - NOMBRE - PRECIO - COD-FABRICANTE**");
            for (Producto producto : listaProducto) {
                System.out.println(producto.toString());
            }
            System.out.println("**********************************************");

        } catch (Exception e) {
            throw e;
        }
    }
//d) Buscar y listar todos los Port�tiles de la tabla producto.

    public void buscarxNombre() {
        try {

            System.out.println("Ingrese el nombre del producto a buscar");
            String rpta = leer.next();

            Collection<Producto> listaProducto = pDAO.listarxNombre(rpta);

            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("** NOMBRE**");
            for (Producto p : listaProducto) {
                System.out.println("PRODUCTO = " + p.getNombre());
            }

            System.out.println("--------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //e) Listar el nombre y el precio del producto mas barato.
    public void masBarato() {
        try {
            System.out.println("El producto mas barato es:");
            System.out.println("**Nombre** - **Precio**");

            Producto producto = pDAO.masBarato();

            System.out.println("Producto = " + producto.getNombre() + "| Precio =" + producto.getPrecio());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //f) Ingresar un producto a la base de datos.
    public void cargarProducto() {
        try {

            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next();

            System.out.println("Ingrese el precio del producto");
            double precio = leer.nextDouble();

            System.out.println("Ingrese el codigo de fabricante");
            int codigo_fabricante = leer.nextInt();

            pDAO.cargarProducto(new Producto(0, nombre, precio, codigo_fabricante));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //h) Editar un producto con datos a elección.
    public void editarProducto() {
        try {
            System.out.println("Ingrese el codigo del producto a modificar");
            int cod = leer.nextInt();
            Producto p = pDAO.buscarXcodigo(cod);
            
            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();
            
            System.out.println("INGRESE PRECIO: ");
            double precio = leer.nextDouble();
            
             System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int codigo_fabricante = leer.nextInt();
            
            pDAO.modificarProducto(new Producto(0, nombre, precio, codigo_fabricante));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
