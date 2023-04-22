/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import main.entidades.Raices;
import main.servicios.RaicesServicios;


public class EjercicioExtra1 {
    public static void main(String[] args) {
        RaicesServicios rs = new RaicesServicios();
        Raices raiz = new Raices(2, 4, 2);
        rs.calcular(raiz);
    }
}
