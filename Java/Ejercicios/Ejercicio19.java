/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaintroguia1;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio19 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz;
        matriz = new int [4][4];
        Random num = new Random();

        
        System.out.println("La matriz A es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = num.nextInt(21) - 10;
                System.out.print( matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La matriz anti simetrica es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
         System.out.print(-matriz[i][j] + " ");
            }
            System.out.println();
        }
           
    }
}