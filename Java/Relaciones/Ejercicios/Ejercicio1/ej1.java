/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import Entidades.Perro;
import Entidades.Persona;


/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 */
public class ej1 {

    public static void main(String[] args) {
  Perro[] perros = new Perro[2];
  Persona[] personas = new Persona[2];
  
  perros[0] = new Perro("Tobi", "Pitbull", 3, "Grande");
  perros[1] = new Perro("Coco", "Caniche", 10, "Chiquito");
  
  personas[0] = new Persona("Roberto", "Gonzales", 40, 12345678, null);
  personas[1] = new Persona("Lionel", "Messi", 36, 23123456, null);
  
        for (int i = 0; i < personas.length; i++) {
            personas[i].setPerro(perros[i]);
        }
  
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

}
