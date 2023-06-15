package Servicios;

import Entidades.Electrodomesticos;
import java.util.Scanner;

/**
 * .Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
 * correcta, sino es correcta usara la letra F por defecto. Este método se debe
 * invocar al crear el objeto y no será visible. • Método comprobarColor(String
 * color): comprueba que el color es correcto, y si no lo es, usa el color
 * blanco por defecto. Los colores disponibles para los electrodomésticos son
 * blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas
 * o en minúsculas. Este método se invocará al crear el objeto y no será
 * visible. Metodo crearElectrodomestico(): le pide la información al usuario y
 * llena el electrodoméstico, también llama los métodos para comprobar el color
 * y el consumo. Al precio se le da un valor base de $1000. • Método
 * precioFinal(): según el consumo energético y su tamaño, aumentará el valor
 * del precio. LETRA PRECIO A $1000 B $800 C $600 D $500 E $300 F $100 aparato.getPeso
 * PRECIO Entre 1 y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79 kg $800 Mayor
 * que 80 kg $1000
 */
public class ElectrodomesticoService {

    protected Scanner leer = new Scanner(System.in);
    protected Electrodomesticos aparato = new Electrodomesticos();

    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    public void comprobarConsumoEnergetico() {
        char letra = Character.toUpperCase(aparato.getConsumoEnergetico());

        if (letra >= 'A' && letra <='F') {
            aparato.setConsumoEnergetico(letra);
        } else {
            aparato.getConsumoEnergetico();
        }
    }

    /*
     Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    public String comprobarColor(String color) {
        color = color.toLowerCase();
        if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y
 * llena el electrodoméstico, también llama los métodos para comprobar el color
 * y el consumo. Al precio se le da un valor base de $1000. 
     */
    public Electrodomesticos crearElectrodomestico() {

        System.out.println("Indique el color ");
        aparato.setColor(leer.next());
        System.out.println("Indique el Peso");
        aparato.setPeso(leer.nextInt());
        System.out.println("Indique el consumo");
        aparato.setConsumoEnergetico(leer.next().charAt(0));
        comprobarConsumoEnergetico();
        aparato.setPrecio(1000);
        return aparato;
    }

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor
 * del precio. LETRA PRECIO A $1000 B $800 C $600 D $500 E $300 F $100 aparato.getPeso
 * PRECIO Entre 1 y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79 kg $800 Mayor
 * que 80 kg $1000
     */
    public double precioFinal() {
      
        switch (aparato.getConsumoEnergetico()) {
            case 'A':
                aparato.setPrecio(aparato.getPrecio() + 1000);
                break;
            case 'B':
                aparato.setPrecio(aparato.getPrecio() + 800);
                break;
            case 'C':
                aparato.setPrecio(aparato.getPrecio() + 600);
                break;
            case 'D':
                aparato.setPrecio(aparato.getPrecio() + 500);
                break;
            case 'E':
                aparato.setPrecio(aparato.getPrecio() + 300);
                break;
            case 'F':
                aparato.setPrecio(aparato.getPrecio() + 100);
                break;

        }
        if (aparato.getPeso() >= 1 && aparato.getPeso() <= 19) {
            aparato.setPrecio(aparato.getPrecio() + 100);
        } else if (aparato.getPeso() >= 20 && aparato.getPeso() <= 49) {
            aparato.setPrecio(aparato.getPrecio() + 500);
        } else if (aparato.getPeso() >= 50 && aparato.getPeso() <= 79) {
            aparato.setPrecio(aparato.getPrecio() + 800);
        } else if (aparato.getPeso() >= 80) {
            aparato.setPrecio(aparato.getPrecio() + 1000);
        }
        return aparato.getPrecio();
    }
}
