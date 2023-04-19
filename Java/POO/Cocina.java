/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtras.Clases;

import java.util.Scanner;

public class Cocina {
Scanner leer = new Scanner(System.in);
  public Receta[] receta ;

    public Cocina(Receta[] receta) {
        this.receta = receta;
    }

    public Cocina() {
    }
  
  public void cargarCocina() { 
      int aux;
      System.out.println("Ingrese la cantidad de recetas");
      aux = leer.nextInt();
      receta = new Receta[aux];
      leer.nextLine();
       for (int i = 0; i < receta.length; i++) {
            receta[i] = new Receta();
        }
   
  }
   public void buscaReceta() {
       String nombre;
       System.out.println("Ingrese nombre de la receta a buscar");
       nombre = leer.nextLine();
       for (int i = 0; i < receta.length; i++) {
           if (receta[i].nombre.equals(nombre)) {
               receta[i].mostraReceta();
           }
       }
       
   }     
   
   public void listaRecetas() {
       for (int i = 0; i < receta.length; i++) {
           System.out.println(receta[i].nombre);
       }
   } 
 
   
   public void nuevaReceta() {
       for (int i = 0; i < receta.length; i++) {
         receta[i].nuevaReceta();
       }
   }
}
