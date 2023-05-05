
package main.servicios;

import java.util.Scanner;
import main.entidades.Curso;


public class CursoService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public String[] cargarAlumnos(int dimension) {
        String[] alumnos = new String[dimension];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = leer.next();
        }
        return alumnos;
    }
    
    public Curso crearCurso() {
        Curso cs = new Curso();
        System.out.println("Escriba el nombre del curso");
        cs.setNombreCurso(leer.next());
        System.out.println("Que cantidad de horas cursa por dia?");
        cs.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Cuantos dias dura la cursada?");
        cs.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Indique si es turno Mañana o Tarde");
        cs.setTurno(leer.next());
        System.out.println("Indique el costo de las horas");
        cs.setPrecioPorHora(leer.nextInt());
        
        cs.setAlumnos(cargarAlumnos(cs.getAlumnos().length));
        return cs;
    }
    
    public void calcularGananciaSemanal(Curso cs) {
        double ganancia = cs.getCantidadHorasPorDia()*cs.getPrecioPorHora() * cs.getCantidadDiasPorSemana() * cs.getAlumnos().length;
        System.out.println("La ganancia es " + ganancia);
    }
}
