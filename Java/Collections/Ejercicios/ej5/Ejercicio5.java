
package Ejercicio5;

import Servicio.PaisesService;
public class Ejercicio5 {
public static void main(String[] args) {
        PaisesService ps = new PaisesService();
        
        ps.cargarPaises();
        ps.ordenar();
        System.out.println("");
        ps.eliminarPais();
    }
}