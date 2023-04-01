/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtras.Clases;

import java.util.Scanner;

public class Juego {

    private String jugador1, jugador2;
    private int numero, intentos, ganador1, ganador2, num;

    public Juego(String jugador1, String jugador2, int numero) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.numero = numero;
    }

    public Juego() {

    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Jugador 1");
        this.jugador1 = leer.next();
        System.out.println("Ingrese el nombre del Jugador 2");
        this.jugador2 = leer.next();
        System.out.println(jugador1 + " Elija un numero ");
        this.numero = leer.nextInt();
        System.out.println(jugador2 + " Adivine el numero  ");
        num = leer.nextInt();
        intentos = 5;
        while (intentos > 0) {
            if (num == this.numero) {
                System.out.println("Felicitaciones adivino el numero");
                ganador2 += 1;
                break;
            } else if (num < this.numero) {
                System.out.println("Ingrese un numero mas alto");
                num = leer.nextInt();
                intentos--;
                System.out.println("Le quedan " + intentos + " intentos ");
            } else {
                System.out.println("Ingrese un numero mas bajo");
                num = leer.nextInt();
                intentos--;
                System.out.println("Le quedan " + intentos + " intentos ");
            }
        }
        if (intentos == 0) {
            System.out.println("Lo siento te quedaste sin intentos");
            ganador1 += 1;
        }

        intentos = 5;

        System.out.println("¿Quieres jugar otra vez? (S/N)");
        String opcion = leer.next();
        if (opcion.equalsIgnoreCase("S")) {
            iniciar_juego();
        } else {
            System.out.println("Resumen del juego:");
            System.out.println(jugador2 + " ganó " + ganador2 + " veces.");
            System.out.println(jugador1 + " ganó " + ganador1 + " veces.");
        }
    }
}
   
    
    

