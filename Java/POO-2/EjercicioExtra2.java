
package main;

import main.entidades.NIF;
import main.servicios.NIFService;


public class EjercicioExtra2 {
    public static void main(String[] args) {
        NIFService nifs = new NIFService();
        NIF nif = new NIF();
        nifs.crearNif(nif);
        nifs.mostrar(nif);
    }
}
