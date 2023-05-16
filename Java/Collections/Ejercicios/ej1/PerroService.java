
package Ejercicio1.Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/

public class PerroService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
  private  ArrayList<String> raza = new ArrayList();
    
   public void cargarRaza() {
       boolean continuar = true;
        do {
            System.out.println("Ingrese una raza de perro");
            raza.add(leer.next());
            System.out.println("Desea agregar otra raza? S/N");
            String rpta = leer.next();
            if (rpta.equalsIgnoreCase("N"))              
                continuar = false;
    } while (continuar);
        mostrarRaza();
//        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
        System.out.println("Que raza de perro desea eliminar?");
        String eliminar = leer.next();
        Iterator<String> it = raza.iterator();
        boolean borrar = false;
        while (it.hasNext()) {
           String aux = it.next();
           
            if (aux.equals(eliminar)) {
                it.remove();
                System.out.println("Se elimino la raza");
                Collections.sort(raza);
                borrar = true;
                break;
            } 
       }
        
        if (!borrar) {
                System.out.println("La raza ingresada no se encuentra en la lista.");
                Collections.sort(raza);
            }
        
        mostrarRaza();
        
//        String eliminar = leer.next();
//        int indice = raza.indexOf(eliminar);
//        if (indice >= 0) {
//            raza.remove(indice);
//        } else {
//            System.out.println("La raza ingresada no se encuentra en la lista.");
//        }
    }
   
   public void mostrarRaza() {
       System.out.println("Las razas son: ");
       for (String var: raza){
           System.out.println(var);
       }
   }
}
