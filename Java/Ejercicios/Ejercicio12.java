package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int largo;
        int correcta=0, incorrecta=0;
        do {
            System.out.println("Escriba una cadena con el formato X...O");
            cadena = leer.nextLine();
            largo = cadena.length();

            if ( largo <= 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")) {
                correcta++;
                System.out.println("La secuencia es correcta");
            } else {
            incorrecta ++;
             System.out.println("La secuencia es incorrecta");
        }

        } while( !cadena.equals("&&&&&")) ;


        System.out.println("Las secuencias correctas fueron " + correcta);
        System.out.println("Las secuencias incorrectas fueron " + incorrecta);
    }

}