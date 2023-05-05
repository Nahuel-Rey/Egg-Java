
package main.servicios;

import java.util.Arrays;

public class ArregloService {

    public void inicializarA(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i+2;
        }
        System.out.println("-----------------------------------");
    }

    public void mostrar(double[] array) {
        System.out.print( Arrays.toString(array));
        System.out.println("-----------------------------------");
    }

    public void ordenar(double[] array) {
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("[" + array[i] + "]");
            //mostrar(array);
        }
    }

    public void InicializarB(double[] arrayA, double[] arrayB) {
        System.arraycopy(arrayA, 0, arrayB, 0, arrayB.length / 2);
        Arrays.fill(arrayB, arrayB.length / 2, arrayB.length, 0.5);

    }
}
