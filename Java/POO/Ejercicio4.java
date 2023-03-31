/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO;

import EjerciciosPOO.Rectangulo.Rectangulo;

/**
 *
 * @author Nahuel
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        System.out.println("La superficie del rectangulo es = " + rectangulo.superficie());
        System.out.println("El perimetro del rectangulo es = " + rectangulo.perimetro());
        rectangulo.dibujarRectangulo();
    }
}
