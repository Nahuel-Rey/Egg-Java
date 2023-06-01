
package Entidades;

import Enum.Palo;
import java.util.ArrayList;


public class Baraja {
    private ArrayList<Cartas> cartas;

    public Baraja() {
    }

    public Baraja(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }
    
}
