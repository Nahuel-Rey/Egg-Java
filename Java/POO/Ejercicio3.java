/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO;

import EjerciciosPOO.Operacion.Operacion;

/**
 *
 * @author Nahuel
 */
public class Ejercicio3 {
     public static void main(String[] args) {
        Operacion operacion= new Operacion();
        operacion.crearOperacion();
         System.out.println("La suma de los numeros " + operacion.getNumero1() + " y " + operacion.getNumero2() + " es = " + operacion.sumar() );
         System.out.println("La resta de los numeros es " + operacion.restar());
         System.out.println("La multiplicacion de los numeros es " + operacion.multiplicar());
         System.out.println("La division de los numeros es " + operacion.dividir());
    }
}
 