
package main;

import main.entidades.Estudiante;
import main.servicios.EstudianteServicio;


public class Integrador {
    
    public static void main(String[] args) {
        EstudianteServicio ess = new EstudianteServicio();
        Estudiante[] es = new Estudiante[4];
        ess.crearAlumno(es);
        System.out.println(" El promedio es "+ ess.mostrarPromedio(es));
        ess.mostrarArreglo(ess.notaMayor(es));
    }
    
}
