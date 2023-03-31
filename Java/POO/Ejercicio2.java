/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO;

import EjerciciosPOO.Circunferencia.Circunferencia;


public class Ejercicio2 {
    public static void main(String[] args) {
        
        Circunferencia circulo1 = new Circunferencia(0);
        circulo1.crearCircunferencia();
        System.out.println("El radio es " + circulo1.getRadio());
        System.out.println("El area de la circunferencia es " + circulo1.area());
        System.out.println("El perimetro de la circunferencia es " + circulo1.perimetro());
    }
}
