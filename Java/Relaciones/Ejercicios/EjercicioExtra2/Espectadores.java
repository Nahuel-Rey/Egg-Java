
package main.Entidades;

/**
Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 */
public class Espectadores {
    
    private String nombre;
    private int edad;
    private double dinero;

    public Espectadores() {
    }

    public Espectadores(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    
    
}
