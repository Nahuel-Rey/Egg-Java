/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtras.Clases;

import java.util.Scanner;

public class Cuenta {

    public int saldo;
    public String titular;

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea retirar");
        int retiro = leer.nextInt();
        if (saldo > retiro) {
            saldo -= retiro;
            System.out.println("El saldo es = " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }
}
