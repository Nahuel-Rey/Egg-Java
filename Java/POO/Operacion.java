/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Operacion;

import java.util.Scanner;

public class Operacion {

    private int numero1, numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return this.numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        this.numero1 = leer.nextInt();
        this.numero2 = leer.nextInt();

    }

    public int sumar() {
        return this.numero1 + this.numero2;
    }

    public int restar() {
        return this.numero1 - this.numero2;
    }

    public int multiplicar() {
        if (this.numero1 != 0 && this.numero2 != 0) {
            return this.numero1 * this.numero2;
        } else {
            System.out.println("Error");
            return 0;
        }
    }

    public int dividir() {
        if ( this.numero2 != 0) {
            return this.numero1 / this.numero2;
        } else {
            System.out.println("Error");
            return 0;
        }
    }

}
