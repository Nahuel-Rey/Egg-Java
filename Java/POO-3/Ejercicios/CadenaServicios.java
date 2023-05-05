
package main.servicios;

import java.util.Scanner;
import main.entidades.Cadena;


public class CadenaServicios {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarVocales(Cadena cadena) {
        char vocal;
        int contador = 0;
        
        for (int i = 0; i < cadena.getLongitudFrase()-1; i++) {
            vocal = cadena.getFrase().toUpperCase().charAt(i);
            
            if (vocal =='A' || vocal =='E' || vocal =='I' || vocal =='O' || vocal =='U') {
                contador++;
            }
        }
        System.out.println("La frase tiene: " + contador + " vocales. ");
    }
    
    public void invertirFrase(Cadena cadena) {
        /*
          String invertida = " ";
        for (int i = cadena.getLongitudFrase() -1; i >=0; i--) {
          //  invertida += cadena.getFrase().charAt(i);
            invertida += cadena.getFrase().substring(i, i+1);
        }
        System.out.println(invertida);
    }
        */
      StringBuilder builder = new StringBuilder(cadena.getFrase());
      builder.reverse();
      
      String fraseInvertida = builder.toString();
        System.out.println("   " + fraseInvertida);
    }
    public void vecesRepetido(Cadena cadena) {
        System.out.println("Ingrese la letra a buscar");
        String letra = leer.next();
        int posicion = cadena.getFrase().indexOf(letra);
        int contador = 0;
        while (posicion != -1) {
            contador++;
            posicion = cadena.getFrase().indexOf(letra, posicion + 1);
        }
        System.out.println("La letra " + letra + " aparece : " + contador + " veces.");
    }
    
   public void compararLongitud(Cadena cadena) {
       System.out.println("Ingrese una frase para comparar longitudes");
       String frase = leer.next().toUpperCase() ;
       if (cadena.getLongitudFrase() == frase.length()) {
           System.out.println("Las frases tienen la misma longitud");
       } else {
           System.out.println("Las frases tienen distinta longitud");
       }
   }
   
   public void unirFrase(Cadena cadena) {
       System.out.println("Ingrese una frase");
       String frase = leer.nextLine() ;
       String fraseResultante = cadena.getFrase().concat(","+ frase);
       System.out.println("La frase resultante es : " + fraseResultante);
    
       }
   
   public void reemplazar(Cadena cadena) {
       System.out.println("Ingrese la letra por la que desea reemplazar la 'A' ");
       char letra = leer.next().toLowerCase().charAt(0);
       String fraseNueva = cadena.getFrase().replace('a', letra);
       System.out.println("La frase con la letra ingresada por la 'A' es : " + fraseNueva);
       }
   
    public void contiene(Cadena cadena) {
        boolean rpta = false;
        System.out.println("Ingrese la letra que desea buscar");
        String letra = leer.next().toLowerCase();
        if (cadena.getFrase().contains(letra)) {
            rpta = true;
        }
        System.out.println("La letra esta en la frase? : " + rpta);
    }

}

   
   

