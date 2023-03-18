/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroguia1;
 import java.util.Scanner;
/**
 *
 * @author Nahuel
 */
public class JavaIntroGuia1 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        
        String mayusculas = frase.toUpperCase(); // Convertir a mayúsculas
        String minusculas = frase.toLowerCase(); // Convertir a minúsculas
        
        System.out.println("Frase en mayúsculas: " + mayusculas);
        System.out.println("Frase en minúsculas: " + minusculas);
    }
}

        
    
    

