/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia3Extras;

import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class EjercicioExtra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char socioTipo;
        do {
            System.out.println("ingrese tipo de socio");
            socioTipo = leer.next().toLowerCase().charAt(0);
            System.out.println("ingrese importe del tratamiento");
            double importe = leer.nextDouble();
            switch (socioTipo) {
                case 'a':
                    System.out.println("Importe con desc (50%) $" + importe * 0.5);
                    break;
                case 'b':
                    System.out.println("Importe con desc (35%) $" + importe * 0.35);
                    break;
                case 'c':
                    System.out.println("importe sin desc $" + importe);
                    break;
                default:
                    System.out.println("categoria no existente");
            }

        } while (socioTipo != 'a' && socioTipo != 'b' && socioTipo != 'c');
}
    }

