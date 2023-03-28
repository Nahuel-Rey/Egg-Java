/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia3Extras;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 * 
 */
public class EjercicioExtra1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min, dias, horas;
        
        System.out.println("Ingrese minutos a calcular");
        min = leer.nextInt();
        
        horas = min / 60;
        
        dias = horas / 24;
        horas = horas % 24;
        
        System.out.println(min + " minutos son " + dias + " dias y " + horas + " horas");
    }
}
