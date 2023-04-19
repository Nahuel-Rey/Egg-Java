/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
*/
package EjerciciosExtras;

import EjerciciosExtras.Clases.Cocina;


public class EjercicioExtra4 {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        cocina.cargarCocina();
        cocina.nuevaReceta();
        cocina.buscaReceta();
        
        cocina.listaRecetas();
    }
}
