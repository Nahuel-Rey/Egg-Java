/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.servicios;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import main.entidades.CuentaBancaria;

public class CuentaBancariaServicio  {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("Ingrese su DNI:");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("Ingrese su numero de cuenta:");
        cuenta.setNumeroCuenta(leer.nextInt()); ;
        System.out.println("Ingrese el saldo: ");
        cuenta.setSaldoActual(leer.nextDouble());
        
        return cuenta;
    }  
    
    public void ingresar(CuentaBancaria cuenta) {
        System.out.println("Cuanto dinero desea ingresar");
        double ingreso = leer.nextDouble();
        cuenta.setSaldoActual(ingreso + cuenta.getSaldoActual());
         
    }
    
    public void retirar(CuentaBancaria cuenta) {
        System.out.println("Cuanto dinero desea retirar");
        double retiro = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
    }
    
    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Puede retirar solo " + cuenta.getSaldoActual() * 0.2);
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
    }
    
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo actual es: " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("El numero de cuenta es: " + cuenta.getNumeroCuenta()) ;
        System.out.println("El numero de DNI es: " + cuenta.getDniCliente()) ;
         System.out.println("El saldo actual es: " + cuenta.getSaldoActual()) ;
    }
}
