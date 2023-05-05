
package main;

import main.entidades.Cadena;
import main.servicios.CadenaServicios;


public class Ej1Utilidades {
    
    public static void main(String[] args) {
        CadenaServicios cs = new CadenaServicios();
        Cadena cadena = new Cadena("casa blanca");
        cs.mostrarVocales(cadena);
        cs.invertirFrase(cadena);
        cs.vecesRepetido(cadena);
        cs.compararLongitud(cadena);
        cs.unirFrase(cadena);
        cs.reemplazar(cadena);
        cs.contiene(cadena);
    }
    
}
