package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Persona> personas = new ArrayList();
    private ArrayList<Perro> perros = new ArrayList();

    public Persona crearPersona() {
        Persona personas = new Persona();

        System.out.println("Ingrese el nombre");
        personas.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        personas.setApellido(leer.next());
        System.out.println("Ingrese la edad");
        personas.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento");
        personas.setDocumento(leer.nextLong());
        personas.setPerro(null);

        return personas;
    }

    public Perro crearPerro() {
        Perro perros = new Perro();

        System.out.println("Ingrese el nombre del perro");
        perros.setNombre(leer.next());
        System.out.println("Ingrese la raza ");
        perros.setRaza(leer.next());
        System.out.println("Ingrese la edad");
        perros.setEdad(leer.nextInt());
        System.out.println("Indique el tamaño del perro");
        perros.setTamanio(leer.next());
        perros.setDuenio(null);
        return perros;
    }

    public void creacion() {
        System.out.println("Cuantas personas quiere agregar?");
        int cantidadPersonas = leer.nextInt();
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Persona " + (i + 1));
            personas.add(crearPersona());
        }

        System.out.println("Cuantos perros quiere agregar?");
        int cantidadPerros = leer.nextInt();
        for (int i = 0; i < cantidadPerros; i++) {
            System.out.println("Perro " + (i + 1));
            perros.add(crearPerro());
        }

    }

    public void eleccion() {
        boolean adoptado = false;

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " ¿quiere adoptar un perro? S/N ");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Elija que perro quiere adoptar de la siguiente lista");

                for (Perro aux : perros) {
                    System.out.println(aux.toString());
                }
                String nombrePerro = leer.next();
                for (int i = 0; i < perros.size(); i++) {
                    if (nombrePerro.equalsIgnoreCase(perros.get(i).getNombre()) && perros.get(i).getDuenio() == null) {
                        adoptado = true;
                        persona.setPerro(perros.get(i));
                        perros.get(i).setDuenio(persona.toString());
                        System.out.println("Felicidades, adopto a : " + perros.get(i).getNombre());
                        perros.remove(i);
                        break;
                    }
                    if (adoptado == false) {
                        System.out.println("Perro no encontrado o disponible");
                    }

                }
            } else {
                continue;
            }

        }

    }

    public void mostrarPersonas() {
        System.out.println("Lista de personas que adoptaron");
        for (Persona persona : personas) {
            if (persona.getPerro() != null) {
                System.out.println(persona);
            } else {
                break;
            }

        }
    }

}
