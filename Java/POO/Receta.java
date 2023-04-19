/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtras.Clases;

import java.util.Scanner;


public class Receta {
    public String[] ingredientes;
    public String nombre;

    public Receta(String[] ingredientes,String nombre) {
        this.ingredientes = ingredientes;
        this.nombre = nombre;
    }

    public Receta() {
    }
    
    public void nuevaReceta() {
        int aux;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la receta ") ;
        nombre = leer.nextLine();
        System.out.println("Ingrese la cantidad de ingredientes");
        aux = leer.nextInt();
        ingredientes = new String[aux];
        leer.nextLine();
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.print("Ingrediente " + (i+1) + ": ");
            ingredientes[i] = leer.nextLine();
        }
    }
    
    public void mostraReceta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ingredientes: ");
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println(ingredientes[i]);
        }
    }
}
