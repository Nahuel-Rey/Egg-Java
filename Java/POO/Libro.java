/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Libro;

import java.util.Scanner;

public class Libro {

    public int ISBN;
    public String titulo;
    public int pag;
    public String autor;

    public Libro(int ISBN, String titulo, String autor, int pag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.pag = pag;
        this.autor = autor;
    }

    public void nuevoLibro() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de ISBN");
        ISBN = leer.nextInt();
        System.out.println("Ingrese el titulo");
        titulo = leer.next();
        System.out.println("Ingrese el numero de paginas");
        pag = leer.nextInt();
        System.out.println("Ingrese el autor");
        autor = leer.next();
    }

    public void mostrarLibro() {
        System.out.println("el ISBN es = " + ISBN);
        System.out.println("El titulo es = " + titulo);
        System.out.println("La cantidad de paginas es = " + pag);
        System.out.println("El autor es = " + autor);
    }

    public Libro() {
    }
}
