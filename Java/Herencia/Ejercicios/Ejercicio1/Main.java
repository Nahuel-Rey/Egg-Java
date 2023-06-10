

package main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;


public class Main {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carne", 5, "Doberman");
        perro1.alimentarse();
        
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        
       Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
       gato1.alimentarse();
       
       Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
       caballo1.alimentarse();
    }
}
