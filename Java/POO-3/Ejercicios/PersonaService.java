
package main.servicios;

import java.util.Date;
import java.util.Scanner;
import main.entidades.Personas;


public class PersonaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Personas crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Indique su fecha de nacimiento: \n"
                + "-dia\n"
                + "-mes\n"
                + "-año");
        int dia = leer.nextInt();
        int mes = leer.nextInt()-1;
        int anio = leer.nextInt()-1900;
        Date fecha = new Date(anio, mes, dia);
        
        return new Personas(nombre, fecha);
    }
    
    public int calcularEdad ( Personas ps) {
        Date actual = new Date();
        int diferencia = actual.getYear() - ps.getFecha().getYear();
        return diferencia;
    }
    
    public boolean menorQue(Personas persona, int edad) {
        int edadPersona = calcularEdad(persona);
        return edadPersona < edad;
    }
    
    public void mostrarPersona(Personas ps) {
        System.out.println("El nombre es : " + ps.getNombre());
        System.out.println("La Fecha de nacimiento es: " + ps.getFecha());
    }
}
