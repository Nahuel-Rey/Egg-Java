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
public class Ejercicio4 {
    
    public static void main(String[] args ) {
        Scanner leer = new Scanner(System.in) ;
        System.out.println("Ingrese los grados Celsius que desea convertir a Farenheit") ;
        int grados=leer.nextInt() ;
        
        double F = 32 + (9 * grados/5);
        System.out.println(grados + " Celsius son equivalentes a  " + F +  " Farenheit ");
       
        
    }
    
}
