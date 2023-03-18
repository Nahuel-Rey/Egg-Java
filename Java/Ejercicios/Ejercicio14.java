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
public class Ejercicio14 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euros ;
        
        System.out.println("Ingrese la cantidad de euros que desea convertir");
        euros = leer.nextDouble();
        
        System.out.println("1.Libra\n"
                                +  "2.Dolar\n"
                                +  "3.Yen"
        );
        int opcion = leer.nextInt();
        conversor(euros,opcion);
        
    }
    public static void conversor(double euro, int opcion) {
        double resultado;
        switch (opcion) {
            case 1:
                resultado = euro * 0.86;
                System.out.println(euro + "euros equivalen a " + resultado + " libras ");
                break;
            case 2:
                resultado = euro * 1.28611;
                System.out.println(euro + "euros equivalen a " + resultado + " dolares ");
                break;
            case 3:
                 resultado = euro * 129.852;
                System.out.println(euro + " euros equivalen a  " + resultado + " yenes ");
                break;
            default:
            
        }
    }
}
