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
public class Ejercicio18 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz;
        matriz = new int [4][4];
        
        System.out.println("La matriz A es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print( matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La matriz B es:");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
         System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
           
    }
}
