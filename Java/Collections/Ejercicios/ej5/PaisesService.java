package Servicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente).
 * Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
* cómo se ordena un conjunto.
* Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
* buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
* usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
* al usuario.
 */
public class PaisesService {

    private Scanner leer;
    private HashSet<String> paises;

    public PaisesService() {
        this.paises = new HashSet();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarPaises() {
        String opcion;
        do {
            System.out.println("Ingrese el nombre del pais");
            paises.add(leer.next());
            System.out.println("Desea agregar otro pais? : S/N");
            opcion = leer.next();
            while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
                System.out.println("Opcion invalida");
                System.out.println("");
                System.out.println("Desea agregar otro pais? : S/N");
                opcion = leer.next();
            }

        } while (opcion.equalsIgnoreCase("S"));
       mostrar();
    }
    
    public void mostrar() {
        ArrayList<String> paises = new ArrayList(this.paises);
        for (String paise : paises) {
              System.out.println(paise);
        }
   
    }
    
    public void ordenar() {
        TreeSet<String> paises = new TreeSet(this.paises);
        for (String paise : paises) {
            System.out.println(paise);
        }
    }

    
    public boolean eliminarPais() {
        
        System.out.println("Ingrese el pais a eliminar");
        String eliminado = leer.next();
        
        Iterator<String> pais = paises.iterator();
        while (pais.hasNext()) {
            String next = pais.next();
            if (next.equalsIgnoreCase(eliminado)) {
                System.out.println("El pais se elimino");
                pais.remove();
                mostrar();
                return true;
            }  
        }
        System.out.println("No se encontro el pais");
        return false;
    }
}
