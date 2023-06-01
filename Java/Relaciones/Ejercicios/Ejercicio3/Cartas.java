
package Entidades;

import Enum.Palo;


public class Cartas {
    private int numero;
    private Palo palo;

    public Cartas() {
    }

    public Cartas(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Cartas{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
    
}
