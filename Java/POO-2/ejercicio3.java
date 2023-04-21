/**
 Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
4
 */
package main;

import main.entidades.Persona;
import main.servicios.PersonaServicios;

public class ejercicio3 {

    public static void main(String[] args) {
        PersonaServicios ps = new PersonaServicios();
        int[] imcResultados = new int[4];
        Persona[] persona = new Persona[4];
        boolean[] esMayorResultado = new boolean[4];

        for (int i = 0; i < 4; i++) {
            persona[i] = ps.crearPersona();
            imcResultados[i] = ps.calcularIMC(persona[i]);
            esMayorResultado[i] = ps.mayorDeEdad(persona[i]);
        }

        int pesoBajo = 0;
        int pesoIdeal = 0;
        int sobrepeso = 0;
        int porcentajeMayores = 0;

        for (int i = 0; i < 4; i++) {
            switch (imcResultados[i]) {
                case -1:
                    pesoBajo++;
                    break;
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrepeso++;
                    break;
            }

            if (esMayorResultado[i]) {
                porcentajeMayores++;
            }

        }

        System.out.println("El porcentaje de personas por debajo del peso ideal es: " + (pesoBajo / 4.0) * 100);
        System.out.println("El porcentaje de personas con el peso ideal es: " + (pesoIdeal / 4.0) * 100);
        System.out.println("El porcentaje de personas por encima del peso ideal es: " + (sobrepeso / 4.0) * 100);
        System.out.println("El porcentaje de personas mayores de edad es: " + (porcentajeMayores / 4.0) * 100);
        System.out.println("El porcentaje de personas por debajo del peso ideal es: " + ((4 - porcentajeMayores) / 4.0) * 100);
    }
}
