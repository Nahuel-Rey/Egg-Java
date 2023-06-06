package main.Servicios;


import java.util.Random;
import java.util.Scanner;
import main.Entidades.Asientos;
import main.Entidades.Cine;
import main.Entidades.Espectadores;
import main.Entidades.Pelicula;

public class Servicios {
  
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public Pelicula crearPeliculas() {
        System.out.println("Ingrese el nombre de la pelicula");
        String titulo = leer.next();
        System.out.println("Indique la duracion de la pelicula");
        double duracion = leer.nextDouble();
        System.out.println("Indique la edad minima");
        int edadMinima = leer.nextInt();
        System.out.println("Ingrese el director de la pelicula");
        String director = leer.next();

        return new Pelicula(titulo, duracion, edadMinima, director);
    }

//    public void cargarPeliculas() {
//        ArrayList<Pelicula> pelicula = new ArrayList();
//        System.out.println("Cuantas peliculas quiere agregar");
//        int cantidadPeliculas = leer.nextInt();
//        for (int i = 0; i < cantidadPeliculas; i++) {
//            System.out.println("Pelicula " + (i + 1));
//            pelicula.add(crearPeliculas());
//        }
//    }

    public Cine simulacion() {
        Cine cine = new Cine();
        Espectadores espectador = new Espectadores();
        boolean lleno= false;
        Random random = new Random();
        int espectadores = random.nextInt(100);
        Asientos[][] sala = cine.getSala().getAsiento();
        
        mostrarSala(cine);
        
        System.out.println(" ");
        
        for (int i = 0; i < espectadores; i++) {
            espectador.setEdad(random.nextInt(100));
            espectador.setNombre(String.valueOf(i));
            espectador.setDinero(random.nextInt(1000));
            if (espectador.getEdad() >= cine.getPelicula().getEdadMinima() && espectador.getDinero() >= cine.getPrecionEntrada()) {
                int fila;
                int columna;
                int contador = 0;
                do {
                    fila = random.nextInt(8);
                    columna = random.nextInt(6);
                    contador++;
                    if (contador > 100) {
                        lleno = true;
                        break;
                    }
                  
                } while (cine.getSala().getAsiento()[fila][columna].isOcupado());
                  if (lleno) {
                        System.out.println("La sala esta llena");
                        break;
                    } else {
                Asientos asiento = sala[fila][columna];
                asiento.setNombre(asiento.getNombre() + "X ");
                asiento.setEspectador(espectador);
                asiento.setOcupado(true);
                sala[fila][columna] = asiento;  
                  }
            }
        }
        mostrarSala(cine);
      return cine;
    }
    
    public void mostrarSala(Cine cine) {
        for (int i = 0; i < cine.getSala().getAsiento().length; i++) {
            for (int j = 0; j < cine.getSala().getAsiento()[0].length; j++) {
                System.out.print( cine.getSala().getAsiento()[i][j] +"  |" );
            }
            System.out.println();
        }
    }
}

