
package Ejercicio3;

import Servicio.AlumnoService;


public class main {
    
    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        
        as.cargaAlumnos();
        as.buscarAlumno();
    
    }
}
