
package Entidades;

import java.util.Scanner;

/**
Clase Jugador: esta clase posee los siguientes atributos: id (representa el n�mero del
jugador), nombre (Empezara con Jugador m�s su ID, �Jugador 1� por ejemplo) y mojado (indica
si est� mojado o no el jugador). El n�mero de jugadores ser� decidido por el usuario, pero
debe ser entre 1 y 6. Si no est� en este rango, por defecto ser� 6.
M�todos:
� disparo(Revolver r): el m�todo, recibe el revolver de agua y llama a los m�todos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el m�todo
devuelve true, sino false.
 */
public class Jugador {
   private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        System.out.println("Ingrese el nombre");
        String nombre2 = leer.next();
        this.nombre = id + " " + nombre2;
        this.mojado = false;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void disparo(Revolver revolver, Jugador jugador) {
        jugador.setMojado(revolver.mojar());
        revolver.siguienteChorro();
    }
}