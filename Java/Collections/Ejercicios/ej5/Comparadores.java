
package Servicio;

import Entidad.Peliculas;
import java.util.Comparator;


public class Comparadores {
    
     public static Comparator<Peliculas> ordenarDuracion = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            return p1.getHoras().compareTo(p2.getHoras());
        }
    };
     
     public static Comparator<Peliculas> ordenarTitulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
     public static Comparator<Peliculas> ordenarDirector = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
}
