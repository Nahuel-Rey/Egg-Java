package Servicio;

import Entidad.Alumno;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

 */
public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList();

    public void cargaAlumnos() {
        String aux;
        do {

            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();

            ArrayList<Integer> notas = new ArrayList();
            int nota;
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i+1));
               
                notas.add(leer.nextInt());
            }

            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);

            System.out.println("Desea seguir ingresando mas alumnos: S/N");
            aux = leer.next();
            while (!aux.equalsIgnoreCase("S") && !aux.equalsIgnoreCase("N")) {
                System.out.println("Ingrese una opcion valida");
                System.out.println("Desea seguir ingresando mas alumnos: S/N");
                aux = leer.next();
            }

        } while (aux.equalsIgnoreCase("S"));

    }

    /*
  Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. */

    public void buscarAlumno() {
        System.out.println("Ingrese el nombre del alumno a buscar");
        String alumno = leer.next();
        boolean encontrado = false;

        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            Alumno next = it.next();
            if (next.getNombre().equalsIgnoreCase(alumno)) {
                notaFinal(next);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El alumno ingresado no existe");
        }
    }

//    Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.*/
//    
    public void notaFinal(Alumno next) {
        ArrayList<Integer> notaFinal = next.getNotas();
        double promedio = 0;

        for (int i = 0; i < notaFinal.size(); i++) {
           promedio += notaFinal.get(i); 
        }
       double promedios = promedio / notaFinal.size();
        System.out.println("El promedio del alumno " + next.getNombre() + " es : " + promedios);
    }

}
