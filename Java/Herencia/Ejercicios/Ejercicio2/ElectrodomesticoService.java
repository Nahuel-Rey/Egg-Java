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
 * del precio. LETRA PRECIO A $1000 B $800 C $600 D $500 E $300 F $100 PESO
 * PRECIO Entre 1 y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79 kg $800 Mayor
 * que 80 kg $1000
 */
public class ElectrodomesticoService {

    protected Scanner leer = new Scanner(System.in);

    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    public char comprobarConsumoEnergetico(char letra) {
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean letraValida = false;
        for (char aux : letras) {
            if (Character.toUpperCase(letra) == aux) {
                letraValida = true;
                return aux;
            }
        }
        return 'F';
    }

    /*
     Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    public String comprobarColor(String color) {
        String[] colores = {"blanco", " negro", "rojo", "azul", "gris"};
        boolean colorValido = false;
        for (String aux : colores) {
            if (color.equalsIgnoreCase(aux)) {
                colorValido = true;
                return aux;
            }
        }
        return "Blanco";
    }

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y
 * llena el electrodoméstico, también llama los métodos para comprobar el color
 * y el consumo. Al precio se le da un valor base de $1000. 
     */
    public Electrodomesticos crearElectrodomestico() {
        Electrodomesticos aparato = new Electrodomesticos();
        System.out.println("Indique el color ");
        String color = leer.next();
        aparato.setColor(comprobarColor(color));
        System.out.println("Indique el peso");
        aparato.setPeso(leer.nextDouble());
        System.out.println("Indique el consumo");
        char letra = leer.next().charAt(0);
        aparato.setConsumoEnergetico(comprobarConsumoEnergetico(letra));
        aparato.setPrecio(1000);
        return aparato;
    }

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor
 * del precio. LETRA PRECIO A $1000 B $800 C $600 D $500 E $300 F $100 PESO
 * PRECIO Entre 1 y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79 kg $800 Mayor
 * que 80 kg $1000
     */
    public double precioFinal(Electrodomesticos aparato) {
        double precioFinal = aparato.getPrecio();
        double peso = aparato.getPeso();
        switch (aparato.getConsumoEnergetico()) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;

        }
        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }
        return precioFinal;
    }
}
