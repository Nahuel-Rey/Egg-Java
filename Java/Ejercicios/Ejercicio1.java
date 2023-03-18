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
public class Ejercicio1 {
   static Scanner leer = new Scanner(System.in);    
    public static void main(String[] args) {
       System.out.println("Ingrese dos valores");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("La suma de los numeros es : " +  suma);
        
    }
    
    
}
