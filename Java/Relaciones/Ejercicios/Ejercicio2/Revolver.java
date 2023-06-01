package Entidades;

import java.util.Random;

/**
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente. Métodos: • llenarRevolver(): le pone
 * los valores de posición actual y de posición del agua. Los valores deben ser
 * aleatorios. 
 * • mojar(): devuelve true si la posición del agua coincide con la
 * posición actual 
 * • siguienteChorro(): cambia a la siguiente posición del
 * tambor 
 * • toString(): muestra información del revolver (posición actual y
 * donde está el agua)
 */
public class Revolver {

private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver() {
        Random random = new Random();
        this.posicionActual = random.nextInt(6);
        this.posicionAgua = random.nextInt(6);
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    }

    public void siguienteChorro() {
        if (this.posicionActual == 5) {
            this.posicionActual = 0;
        } else {
            this.posicionActual = this.posicionActual + 1;
        }
    }
    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
}