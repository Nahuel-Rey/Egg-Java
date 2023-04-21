/*
 a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
3
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
 */
package main.servicios;

import java.util.Scanner;
import main.entidades.Persona;

public class PersonaServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese su sexo: ");
        System.out.println("M: mujer \n"
                                   + "H: hombre \n"
                                   + "O: otro");
         System.out.println("Ingrese el sexo (H - hombre, M - mujer, O - otro):");
        char sexo = leer.next().toUpperCase().charAt(0);
        
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo inválido, ingrese nuevamente (H - hombre, M - mujer, O - otro):");
            sexo = leer.next().toUpperCase().charAt(0);
        }
        
        System.out.println("Ingrese su peso: ");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese su altura: ");
        double altura = leer.nextDouble();
        
         return new Persona( nombre, edad, sexo, peso, altura);
    }
    
    public boolean mayorDeEdad(Persona persona) {
        //return persona.getEdad() >= 18 --> es una forma de plantearlo ya que la misma expresion es un booleano
       return persona.getEdad() >= 18;
    } 
    
    public int calcularIMC(Persona persona) {
        double peso = persona.getPeso()/Math.pow( persona.getAltura(), 2);
        if (peso < 20) {
            return -1;
        } else if (peso >= 20 && peso <=25) {
            return 0;
        } else {
                return 1;
        }
      
    }

}
   
    

