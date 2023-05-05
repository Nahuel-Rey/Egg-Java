
package main.servicios;

import java.util.Date;
import java.util.Scanner;


public class FechaService {
    private Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento() {
        System.out.println("Indique su fecha de nacimiento: \n"
                + "-dia\n"
                + "-mes\n"
                + "-año");
        int dia = leer.nextInt();
        int mes = leer.nextInt()-1;
        int anio = leer.nextInt() -1900;
        
        return new Date(anio,mes,dia);
        
    }
    public Date fechaActual() {
        return new Date();
    }
    
    public int diferencia(Date fechaActual, Date fechaNacimiento) {
      // long diferencia = actual.getTime() - nacimiento.getTime();
      // long anio = 365 * 24 * 60 * 60 * 1000L;
       //int edad =(int) (diferencia / anio);
        int diferencia = fechaActual.getYear() - fechaNacimiento.getYear();
        return diferencia;
    }
}
