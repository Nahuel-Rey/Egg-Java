/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaintroguia1;

import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion, suma, resta, multiplicacion, division;
        String respuesta;
        boolean bandera = false;
        System.out.println("Ingrese el primer numero:");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = leer.nextInt();

        
        do {
            System.out.println("MENU\n"
                + "1.Sumar \n"  
                + "2.Resta\n"
                + "3.Multiplicar\n"
                + "4.Dividir\n"
                + "5.Salir\n"
                + "Elija Opcion");
        opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma de " + num1 + " y " + num2 + "es " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta de " + num1 + " y " + num2 + "es " + resta);
                    break;
                case 3:
                    multiplicacion = num1 * num2;
                    System.out.println("La multiplicacion de " + num1 + " y " + num2 + "es " + multiplicacion);
                    break;
                case 4:
                    division = num1 / num2;
                    System.out.println("La division de " + num1 + " y " + num2 + "es " + division);
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? S/N");
                    respuesta = leer.next();
                    if (respuesta.equals("S")) {
                        bandera = false;
                        break;
                    } else {
                        bandera = true;
                    }
                    
            }

        } while (bandera == true);

    }
}
