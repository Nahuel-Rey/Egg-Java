/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtras;

import EjerciciosExtras.Clases.Cancion;


public class EjercicioExtra1 {
    
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        
//       cancion.setAutor("SOAD");
//        cancion.setTitulo("Lonely day");
        System.out.println(cancion.getAutor()+ " " + cancion.getTitulo());
        System.out.println("autor = " + cancion.autor + " titulo = " + cancion.titulo);
    }
}
