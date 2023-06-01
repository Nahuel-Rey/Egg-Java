
package Main;

import Entidades.Baraja;
import Servicios.BarajaService;


public class ej3 {
    
    public static void main(String[] args) {
        BarajaService bs = new BarajaService();
        bs.crearMazo();
        bs.menu();
    }
}
