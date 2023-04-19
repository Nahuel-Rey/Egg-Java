/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import main.entidades.CuentaBancaria;
import main.servicios.CuentaBancariaServicio;


public class ejercicio1 {
    public static void main(String[] args) {
        CuentaBancariaServicio cuentaServicio = new CuentaBancariaServicio();
        CuentaBancaria cuenta = cuentaServicio.crearCuenta();
        cuentaServicio.ingresar(cuenta);
        cuentaServicio.retirar(cuenta);
        cuentaServicio.extraccionRapida(cuenta);
        cuentaServicio.consultarSaldo(cuenta);
        cuentaServicio.consultarDatos(cuenta);
        
      
    }
}
