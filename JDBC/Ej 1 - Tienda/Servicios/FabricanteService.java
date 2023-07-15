
package tienda.Servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.Entidades.Fabricante;
import tienda.Persistencia.fabricanteDAO;


public class FabricanteService {
    
    fabricanteDAO fDAO ;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public FabricanteService(fabricanteDAO fDAO) {
        this.fDAO = fDAO;
    }
    
    public void cargarFabricante() {
        
        try {
            
            System.out.println("Ingrese el nombre del fabricante");
            String nombre = leer.next();
            
            fDAO.cargarFabricante(new Fabricante(0, nombre));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void mostrarFabricantes() {
        try {
            
            Collection<Fabricante> listaFabricantes = fDAO.listarFabricante();
            
            System.out.println("**TABLA DE FABRICANTES**");
            System.out.println("**CODIGO -- NOMBRE**");
            
            for (Fabricante fabricante : listaFabricantes) {
                System.out.println(fabricante.toString());
            }
            System.out.println("-------------------------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
