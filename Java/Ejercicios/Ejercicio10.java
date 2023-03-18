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
public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in) ;
        int limite = 100 ;
        int num = 0;
        int suma = num;
       
        while (suma < limite  ) {
            
            System.out.println("Ingrese un numero");
             num = leer.nextInt();
             suma += num; 
                        
        }
        System.out.println("Se llego al limite");
    }
    
}
