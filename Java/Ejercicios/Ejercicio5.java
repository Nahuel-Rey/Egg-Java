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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in) ;
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        int doble = num * 2 ;
        int triple = num * 3 ;
        int raiz = (int) Math.sqrt(num);
        
        System.out.println("El doble del numero es: " + doble);
        System.out.println("El triple del numero es: " + triple);
        System.out.println("La raiz cuadrada del numero es: " + raiz);
    }
}
