
package main;

import main.servicios.FechaService;


public class Ej4Utilidades {

    public static void main(String[] args) {
        FechaService fs = new FechaService();
        fs.fechaNacimiento();
        System.out.println(fs.fechaActual());
        int dif = fs.diferencia(fs.fechaActual(), fs.fechaNacimiento());
        System.out.println("le diferencia es : " + dif);
    }
    
   
}
