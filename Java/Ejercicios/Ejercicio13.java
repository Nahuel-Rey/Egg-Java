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
public class Ejercicio13 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del cuadrado");
        int cuadrado = leer.nextInt();
        
        for (int i = 0; i < cuadrado; i++) {
            
            for (int j = 0; j < cuadrado; j++) {
                if (  i== 0 || i == cuadrado-1 || j == 0 || j == cuadrado - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
