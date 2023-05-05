
package main.servicios;

import main.entidades.ParDeNumeros;


public class ParDeNumerosServicios {
    
    public void mostrarNumeros(ParDeNumeros numero) {
        System.out.println("Numero : 1 " + numero.getNum1() );
        System.out.println("Numero : 2 " + numero.getNum2());
    }
    
public double devolverMayor (ParDeNumeros numero) {
int mayor = Math.max(numero.getNum1(),numero.getNum2() );
    System.out.println("El mayor numero es " + mayor);
return mayor;
}

    public void calcularPotencia(ParDeNumeros numero) {
        int minimo = Math.min(numero.getNum1(), numero.getNum2());
        System.out.println("El minimo es = " + minimo);
        int resultado;

        resultado = (int) Math.pow(devolverMayor(numero), minimo);
        System.out.println("El resultado del mayor numero a la potencia del menor, es = " + resultado);
    }

    public void calcularRaiz(ParDeNumeros numero) {
        int minimo = Math.abs(Math.min(numero.getNum1(), numero.getNum2()));
        double raiz = Math.sqrt(minimo);
        System.out.println("La raiz del valor minimo es : " + raiz);
    }

}

