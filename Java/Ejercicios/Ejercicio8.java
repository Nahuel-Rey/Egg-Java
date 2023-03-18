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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de 8 letras");
        String palabra = leer.nextLine();
        int largo = palabra.length();
        
        if ( largo <= 8 ){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
