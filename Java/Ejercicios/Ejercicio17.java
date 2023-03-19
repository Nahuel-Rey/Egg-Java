/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaintroguia1;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector;
        int n;

        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10000);
            System.out.println("V[" + i + "] =" + vector[i]);
          
        }
            String tamanio;
            int uno = 0;
            int dos = 0;
            int tres = 0;
            int cuatro= 0;
            int cinco = 0;
        for (int i = 0; i < n; i++) {
            tamanio = String.valueOf(vector[i]);
            switch (tamanio.length()) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos += 1;
                    break;
                case 3:
                    tres += 1;
                    break;
                case 4:
                    cuatro += 1;
                    break;
                case 5:
                    cinco += 1;
                    break;
            }
        }
        System.out.println("");
        System.out.println("cantidad de numeros de un digito = " + uno);
        System.out.println("cantidad de numeros de dos digitos = " + dos);
        System.out.println("cantidad de numeros de tres digitos = " + tres);
        System.out.println("cantidad de numeros de cuatro digitos = " + cuatro);
        System.out.println("cantidad de numeros de cinco digitos = " + cinco);

    }
}
