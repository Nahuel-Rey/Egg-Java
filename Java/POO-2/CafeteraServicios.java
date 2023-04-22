
package main.servicios;

import java.util.Scanner;
import main.entidades.Cafetera;


public class CafeteraServicios {
    Cafetera cf = new Cafetera();
    private Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera cf) {
        cf.setCantidadActual(cf.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera cf) {
        System.out.println("Ingrese el tamaño de la taza");
        int taza = leer.nextInt();
        if (cf.getCantidadActual() > taza) {
            cf.setCantidadActual(cf.getCantidadActual() - taza);
            System.out.println("Se lleno la taza");
        } else if (cf.getCantidadActual() == taza){
            System.out.println("Se lleno la taza " );
            cf.setCantidadActual(0);
        } else {
            System.out.println("se lleno la taza hasta " + cf.getCantidadActual());
            cf.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera cf) {
        cf.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cf) {
        System.out.println("Ingrese cuanto desea agregar");
        int ingreso = leer.nextInt();
        if (ingreso < cf.getCapacidadMaxima()) {
            cf.setCantidadActual(cf.getCantidadActual()+ ingreso);
            System.out.println("Se agrego  " + cf.getCantidadActual() );
        } else {
            System.out.println("Se excede la capacidad maxima, solo se agregara " + (cf.getCapacidadMaxima() - ingreso));
            cf.setCantidadActual(cf.getCapacidadMaxima());
        }
    }
}
