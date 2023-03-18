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
public class Ejercicio15 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector;
        vector = new int[100];
        int contador = 1;
        
        for (int i = 0; i < 100; i++) {
            vector[i] = contador++;
            System.out.println("V [" + i + "] = " + vector[i] );
        }
        System.out.print("");
    }
}
