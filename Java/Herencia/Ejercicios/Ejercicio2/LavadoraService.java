package Servicios;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import java.util.Scanner;

/**
 * Método crearLavadora (): este método llama a crearElectrodomestico() de la
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos el atributo propio de la lavadora. •
 * Método precioFinal():
 * este método será heredado y se le sumará la siguiente funcionalidad. Si tiene
 * una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o
 * igual, no se incrementará el precio. Este método debe llamar al método padre
 * y añadir el código necesario. Recuerda que las condiciones que hemos visto en
 * la clase Electrodoméstico también deben afectar al precio.
 */
public class LavadoraService extends ElectrodomesticoService {

    protected Scanner leer = new Scanner(System.in);

    /*
    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
     */
    public Lavadora crearLavadora() {
        Electrodomesticos maquina = crearElectrodomestico();
        System.out.println("Ingrese la carga");
        int carga = leer.nextInt();
        return new Lavadora(carga, maquina.getPrecio(), maquina.getColor(), maquina.getConsumoEnergetico(), maquina.getPeso());
    }
    
    /*
    Método precioFinal():este método será heredado y se le sumará la siguiente funcionalidad. Si tiene
 * una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o
 * igual, no se incrementará el precio. Este método debe llamar al método padre
 * y añadir el código necesario. Recuerda que las condiciones que hemos visto en
 * la clase Electrodoméstico también deben afectar al precio.
    */
    public double precioFinal(Lavadora lavadora) {
        super.precioFinal(lavadora);
        if (lavadora.getCarga()>30) {
             lavadora.setPrecio(lavadora.getPrecio()+500);
        }
        return lavadora.getPrecio();
    }
    
}
