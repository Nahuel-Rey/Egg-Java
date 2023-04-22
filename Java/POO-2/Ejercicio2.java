
package main;

import main.entidades.Cafetera;
import main.servicios.CafeteraServicios;


public class Ejercicio2 {
    
    
    public static void main(String[] args) {
        CafeteraServicios cfs = new CafeteraServicios();
        Cafetera cf = new Cafetera(3000, 2000);
        
        cfs.llenarCafetera(cf);
        System.out.println("capacidad maxima" + cf.getCapacidadMaxima());
        cfs.servirTaza(cf);
        System.out.println("quedo en la cafetera " + cf.getCantidadActual());
        cfs.agregarCafe(cf);
        System.out.println("La cafetera quedo con " + cf.getCantidadActual());
    }
}
