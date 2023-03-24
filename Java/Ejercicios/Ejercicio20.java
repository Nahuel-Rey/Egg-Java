/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaintroguia1;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz;
        int num;
        boolean magica = true;
        matriz = new int[3][3];
        System.out.println("Ingrese los numeros de la matriz magica, entre 1 y 9");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = leer.nextInt();
                if (num >= 1 && num <= 9) {
                    matriz[i][j] = num;
                } else {
                    System.out.println("numero incorrecto");
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
      
    }
  
}
   
    

