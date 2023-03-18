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
public class Ejercicio7 {
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra eureka");
        String palabra = leer.next();
        
        if ( palabra.equals("eureka")) {
            System.out.println("Correcto");            

         }   else {
            System.out.println("Incorrecto");
        }
    }
            
}