
package main;

import main.entidades.Curso;
import main.servicios.CursoService;


public class Ej6Utilidades {
    
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso curso1 = cs.crearCurso();
        
      cs.calcularGananciaSemanal(curso1);
    }
}
