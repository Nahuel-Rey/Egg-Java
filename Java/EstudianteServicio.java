
package main.servicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import main.entidades.Estudiante;


public class EstudianteServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void crearAlumno(Estudiante[] alumno ) {
 
        for (int i = 0; i <alumno.length; i++) {
            System.out.println("Ingrese el nombre del estudiante " );
           String nombre= leer.next();
            System.out.println("Ingrese la nota del estudiante " );
           double nota  = leer.nextDouble();
          alumno[i] = new Estudiante(nombre, nota);
        }  
    }
    
    public double mostrarPromedio(Estudiante[] alumno) {
        double sumaNota =0;
        double promedio;
        for (int i = 0; i < alumno.length; i++) {
            sumaNota += alumno[i].getNota();
        }
       return promedio = sumaNota/alumno.length;
    }
    
    public String[] notaMayor(Estudiante[] alumno) {
        int contador =0;
        double promedio = mostrarPromedio(alumno);
        
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i].getNota() > promedio) {
               contador++;
            }
        }
        
        String[] nombres = new String[contador];
        int aux = 0;
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i].getNota() > promedio) {               
                nombres[aux] = alumno[i].getNombre();
                        aux++;
            }
        }
        return nombres;
      
    }
    
    public void mostrarArreglo(String[] alumno) {
        System.out.println(" Las notas mayores son " + Arrays.toString(alumno));
    }
}
