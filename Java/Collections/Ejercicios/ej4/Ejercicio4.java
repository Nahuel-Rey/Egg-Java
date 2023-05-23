/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import Servicio.PeliculasService;

public class Ejercicio4 {
    public static void main(String[] args) {
        PeliculasService ps = new PeliculasService();
        
        ps.cargarPeliculas();
        ps.mayor();
        ps.mayorAmenor();
        ps.menorAmayor();
        ps.porTitulo();
        ps.porDirector();
    }
}
