
package main.servicios;

import java.util.Arrays;
import java.util.Scanner;
import main.entidades.Ahorcado1;

public class AhorcadoService {
 Scanner leer = new Scanner(System.in);
 Ahorcado1 ahorcado = new Ahorcado1();
 String[] letrasEncontradas;
    
    public void crearJuego() {
        System.out.println("Ingrese la palabra");
        String palabraAbuscar = leer.next();
        String[] palabra = new String[palabraAbuscar.length()];
        for (int i = 0; i < palabraAbuscar.length(); i++) {
            palabra[i] = palabraAbuscar.substring(i, i+1);
        }
        ahorcado.setaBuscar(palabra);
        letrasEncontradas = new String[ahorcado.getaBuscar().length];
        Arrays.fill(letrasEncontradas, "_");
        System.out.println("Ingrese la cantidad maxima de jugadas");
        ahorcado.setJugadas(leer.nextInt()) ;
        longitud(palabraAbuscar);    
    }

    public void longitud(String palabra) {
        String palabraAdivinar = "";
        for (int i = 0; i < palabra.length(); i++) {
            palabraAdivinar += " - ";
        }
        System.out.println(palabraAdivinar);
    }
    
    public void buscar() {
        while (ahorcado.getJugadas()>0 && ahorcado.getLetrasEncontradas() != ahorcado.getaBuscar().length) {
            System.out.println("");
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            if (encontradas(letra)) {
                System.out.println("La letra pertenece a la palabra");
                imprimirPalabra();
            } else {
                System.out.println("La letra no pertenece a la palabra");
            }
            mostrarIntentos();
        }
        if (ahorcado.getLetrasEncontradas() == ahorcado.getaBuscar().length) {
            System.out.println("Felicidades, adivino la palabra");
        } else {
            System.out.println("Lo siento, se ha quedado sin intentos. La palabra era :" + Arrays.toString(ahorcado.getaBuscar()));
        }
    }
    
    public boolean encontradas(String letra) {
        boolean letraEncontrada = false;
        for (int i = 0; i < ahorcado.getaBuscar().length; i++) {
            if (letra.equals(ahorcado.getaBuscar()[i])) {
                letrasEncontradas[i] = letra;
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas()+1);
                letraEncontrada = true;
            }
        }
        if (!letraEncontrada) {
            ahorcado.setJugadas(ahorcado.getJugadas() - 1);
        }
        return letraEncontrada;
    }
        
        public void mostrarIntentos() {
            System.out.println("Intentos restantes " + ahorcado.getJugadas());
        }
    
       public void imprimirPalabra() {
        for (String letra : letrasEncontradas) {
            System.out.print(letra + " ");
        }
        System.out.println();
    }
       
       public void juego() {
           crearJuego();
           buscar();
       }
}