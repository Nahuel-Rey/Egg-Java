
package main;

import main.entidades.ParDeNumeros;
import main.servicios.ParDeNumerosServicios;




public class Ej2Utilidades {

    public static void main(String[] args) {
        ParDeNumeros numero = new ParDeNumeros();
        ParDeNumerosServicios parService = new ParDeNumerosServicios();
        parService.mostrarNumeros(numero);
        parService.devolverMayor(numero);
        parService.calcularPotencia(numero);
        parService.calcularRaiz(numero);
    }

}
