
package main;

import java.util.Arrays;
import main.servicios.ArregloService;


public class Ej3Utilidades {

    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        ArregloService as = new ArregloService();

        as.inicializarA(A);
        as.mostrar(A);
        as.ordenar(A);
        as.InicializarB(A, B);
        as.mostrar(A);
        as.mostrar(B);
    }
}

