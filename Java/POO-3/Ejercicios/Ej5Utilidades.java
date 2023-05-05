
package main;

import java.util.Date;
import main.entidades.Personas;
import main.servicios.PersonaService;


public class Ej5Utilidades {
    
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Personas persona = ps.crearPersona();
        int edad = ps.calcularEdad(persona);
        System.out.println("Tiene : " + edad + " años.");
        int edadComparar = 40;
        System.out.println("La persona es menor de " + edadComparar + " años? : " + ps.menorQue(persona, edadComparar) );
        ps.mostrarPersona(persona);
}

}
