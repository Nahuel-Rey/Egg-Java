
package main.Entidades;

import main.Servicios.Servicios;

/**
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada
 */
public class Cine {
    private Pelicula pelicula;
    private Integer precionEntrada;
    private Sala sala;

    public Cine() {
        Servicios s = new Servicios();
        this.pelicula=s.crearPeliculas();
        this.precionEntrada=500;
        this.sala= new Sala();
        
    }

    public Cine(Pelicula pelicula, Sala sala, Integer precionEntrada) {
        this.pelicula = pelicula;
        this.precionEntrada = precionEntrada;
        this.sala=sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getPrecionEntrada() {
        return precionEntrada;
    }

    public void setPrecionEntrada(Integer precionEntrada) {
        this.precionEntrada = precionEntrada;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    
}
