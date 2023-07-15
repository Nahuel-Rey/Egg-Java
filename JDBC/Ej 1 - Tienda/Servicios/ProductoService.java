package tienda.Servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.Entidades.Producto;
import tienda.Persistencia.productoDAO;

public class ProductoService {

    productoDAO pDAO;
    Scanner leer = new Scanner(System.in);

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

    public void listarxNombre() throws Exception {
        try {
            Collection<Producto> listaProducto = pDAO.listarProducto();

            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("** NOMBRE**");
            for (Producto producto : listaProducto) {
                System.out.println(" " + producto.getNombre() + " " + " ");
            }

            System.out.println("--------");

        } catch (Exception e) {
            throw e;
        }
    }

    public void listarxNombrePrecio() throws Exception {
        try {
            Collection<Producto> listaProducto = pDAO.listarProducto();

            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("** NOMBRE - PRECIO**");
            for (Producto producto : listaProducto) {
                System.out.println(" " + producto.getNombre() + producto.getPrecio() + " ");
            }

            System.out.println("--------");

        } catch (Exception e) {
            throw e;
        }
    }

    public void listarxRango() throws Exception {
        try {
            
            System.out.println("Ingrese precio minimo");
            double num1 = leer.nextDouble();
            
            System.out.println("Ingrese precio maximo");
            double num2 = leer.nextDouble();
            

            if (num1 < 0) throw new Exception("valor nulo");
            
            if (num2 < 0) throw new Exception("valor nulo");
            
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

    public void buscarxNombre() {
        try {
            
            System.out.println("Ingrese el nombre del producto a buscar");
            String rpta=leer.next();
                     
            Collection<Producto> listaProducto = pDAO.listarxNombre(rpta);

            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("** NOMBRE**");
            for (Producto producto : listaProducto) {
                System.out.println(producto.toString());
            }

            System.out.println("--------");

        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
    
}
