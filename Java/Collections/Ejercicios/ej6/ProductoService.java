package Servicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 */
public class ProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Integer> productos;

    public ProductoService() {
        this.productos = new HashMap();
    }

    public void añadirProducto() {
        String opcion;
        do {
            System.out.println("Ingrese el nombre del producto ");
            String nombre = leer.next();
            System.out.println("Ingrese el valor");
            int valor = leer.nextInt();

            productos.put(nombre, valor);

            System.out.println("Desea agregar otro producto? : S/N");
            opcion = leer.next();

            while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
                System.out.println("Opcion invalida");
                System.out.println("");
                System.out.println("Desea agregar otro producto? : S/N");
                opcion = leer.next();
            }

        } while (opcion.equalsIgnoreCase("S"));

    }

    public void modificarPrecio() {
        boolean encontrar = false;
        System.out.println("Indique el producto a modificar");
        String producto = leer.next();
        System.out.println("Indique el nuevo precio");
        int nuevoPrecio = leer.nextInt();

        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (key.equalsIgnoreCase(producto)) {
                productos.replace(producto, value, nuevoPrecio);
                System.out.println("El precio se modifico con exito");
                encontrar = true;
                break;
            }
        }
        if (!encontrar) {
            System.out.println("El producto no se encuentra en la lista");
        }

    }

    public void eliminarProducto() {
        boolean encontrar = false;
        System.out.println("Indique el producto a eliminar");
        String producto = leer.next();
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (key.equalsIgnoreCase(producto)) {
                productos.remove(key, value);
                System.out.println("El producto se elimino con exito");
                encontrar = true;
                
                break;
            }
        }
        if (!encontrar) {
            System.out.println("El producto no se encuentra en la lista");
        }
    }

    public void mostrar() {
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("Producto : " + key + " | Valor : $" + value );
        }
    }

    public void menu() {
        boolean menu = false;
        do {
            System.out.println(" MENU PRINCIPAL");
            System.out.println("");
            System.out.println("Que desea hacer?:");
            System.out.println("");
            System.out.println("1. Añadir Producto \n"
                    + "2. Modificar precio \n"
                    + "3. Eliminar Producto \n"
                    + "4. Mostrar Lista \n"
                    + "5. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    añadirProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrar();
                    break;
                case 5:
                    menu = true;
                    return;
                default:
                    System.out.println("La opcion ingresada no existe");
            }
        } while (!menu);

    }
}
