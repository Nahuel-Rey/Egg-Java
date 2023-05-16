
package main.servicios;



import java.util.Random;
import java.util.Scanner;
import main.entidades.MesSecreto;


public class MesSecretoService {
    private Scanner leer = new Scanner(System.in);
    MesSecreto ms = new MesSecreto();
    
      public String mesSecreto() {
        Random random = new Random();
        int indice = random.nextInt(12);
        ms.setMesSecreto(ms.getMes()[indice]);
        return ms.getMesSecreto();
    }

    public void Juego() {
    boolean adivinado = false;
    String rpta;
    String mesSecreto = mesSecreto();
    
        do {
            System.out.println("Adivine el mes secreto");
            rpta = leer.next().toLowerCase();
            
            if (mesSecreto.equals(rpta)) {
                System.out.println("Felicitaciones  adivino");
                adivinado = true;
            } else{
                System.out.println("Incorrecto. Intenta de nuevo");
            }
            
        } while (!adivinado);
          
    }
}
