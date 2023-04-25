
package main.servicios;

import java.util.Scanner;
import main.entidades.NIF;


public class NIFService {
    private Scanner leer = new Scanner(System.in);
    private char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
    
            
    public void crearNif(NIF nif){
        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();
        nif.setDni(dni);
      
    }
    
    public char letra(NIF nif) {
        int resto = (int) (nif.getDni() % 23);
        return letras[resto];
    }
           
    public void mostrar(NIF nif) {
        System.out.println("NIF : " + nif.getDni() + "-" + letra(nif) );
    }
            
}
