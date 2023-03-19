/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaintroguia1;

import java.util.Scanner;

/**Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 
 */
public class Ejercicio16 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector;
        int n;
        
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        vector = new int[n];
        boolean bandera = true;
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100);
            System.out.println("V[" + vector[i]  + "]");
        }
   
            System.out.println("Ingrese el numero a buscar");
            int num = leer.nextInt();
                  for (int i = 0; i < n; i++) {
                      if (num == vector[i] ) {
                          
                          System.out.println("El numero se encuentra en V[" + i + "]");
                          bandera = false;
                      }
            }                            
    }
}
