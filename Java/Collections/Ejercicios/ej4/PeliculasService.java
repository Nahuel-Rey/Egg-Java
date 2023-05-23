/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class PeliculasService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Peliculas> pelicula = new ArrayList();
    
    public void cargarPeliculas () {
        String aux;
        do {
            System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese el director de la pelicula");
        String director = leer.next();
        System.out.println("Ingrese la duracion, en horas");
        double horas = leer.nextDouble();
        
        Peliculas peli = new Peliculas(titulo, director, horas);
        pelicula.add(peli);
        
            System.out.println("Desea cargar otra pelicula? : S/N");
            aux = leer.next();
            while (!aux.equalsIgnoreCase("S") && !aux.equalsIgnoreCase("N")) {
                System.out.println("Ingrese una opcion valida");
                System.out.println("Desea cargar otra pelicula? : S/N");
                aux = leer.next();
            }
        } while (aux.equalsIgnoreCase("S"));
        
    } 
    //Mostrar en pantalla todas las películas.
public void mostrarPelicula() {
       System.out.println("Las peliculas son: ");
       for (Peliculas var: pelicula){
           System.out.println(var);
       }
   }
//Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

public void mayor() {
    System.out.println("Las peliculas con mas de una hora de duracion son : ");
    Iterator<Peliculas> it = pelicula.iterator();
    while (it.hasNext()) {
        Peliculas aux = it.next();
        if (aux.getHoras() > 1) {
            System.out.println( aux.getTitulo());
        }
    }
}



public void mayorAmenor() {
    
    Collections.sort(pelicula,Comparadores.ordenarDuracion );
    Collections.reverse(pelicula);
     System.out.println("Las pelis ordenadas por duración de mayor a menor: ");
    for (Peliculas aux : pelicula) {
         System.out.println( aux.getTitulo() + " con duración de " + aux.getHoras());
    }
}

public void menorAmayor() {
    Collections.sort(pelicula,Comparadores.ordenarDuracion);
    System.out.println("Las pelis ordenadas por duración de menor a mayor: ");
    for (Peliculas aux : pelicula) {
        System.out.println( aux.getTitulo() + " con duración de " + aux.getHoras());
    }
}

    public void porTitulo() {
        Collections.sort(pelicula, Comparadores.ordenarTitulo);
        System.out.println("Las pelis ordenadas por titulo en orden alfabetico son : ");
        for (Peliculas aux : pelicula) {
            System.out.println(aux.getTitulo());
        }
    }

    public void porDirector() {
        Collections.sort(pelicula, Comparadores.ordenarDirector);
        System.out.println("Las pelis ordenadas por director en orden alfabetico son : ");
        for (Peliculas aux : pelicula) {
            System.out.println(aux.getDirector());
        }
    }
}
