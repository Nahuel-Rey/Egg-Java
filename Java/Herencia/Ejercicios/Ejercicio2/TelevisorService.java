package Servicios;

import Entidades.Electrodomesticos;
import Entidades.Televisor;
import java.util.Scanner;

/**
 * Método crearTelevisor(): este método llama a crearElectrodomestico() de la
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos los atributos del televisor.
 */
public class TelevisorService extends ElectrodomesticoService {

    protected Scanner leer = new Scanner(System.in);
    protected Electrodomesticos maquina = crearElectrodomestico();
    protected Televisor tele = new Televisor();

    public Televisor crearTelevisor() {

        System.out.println("Indique las pulgadas");
        tele.setResolucion(leer.nextDouble());
        
        System.out.println("Poseo TDT?");
        String rpta = leer.next();
        boolean TDT = false;
        if (rpta.equalsIgnoreCase("S")) {
            TDT = true;
            tele.setTDT(TDT);
        } else {
            tele.setTDT(TDT);
        }

        tele.setColor(maquina.getColor());
        tele.setConsumoEnergetico(maquina.getConsumoEnergetico());
        tele.setPeso(maquina.getPeso());
        tele.setPrecio(super.precioFinal());

        return tele;
    }

    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
     */
    public double precioFinal() {

        if (tele.getResolucion() > 40) {
            tele.setPrecio(tele.getPrecio() * 1.30);
        }
        if (tele.isTDT()) {
            tele.setPrecio(tele.getPrecio() + 500);
        }

        return tele.getPrecio();
    }
}
