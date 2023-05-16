
package main.entidades;


public class Ahorcado1 {
    private String [] aBuscar ;
    private int letrasEncontradas;
    private int jugadas;

    public Ahorcado1() {
    }

    public Ahorcado1(String [] aBuscar, int letrasEncontradas, int jugadas) {
        this.aBuscar = aBuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadas = jugadas;
    }

    public String [] getaBuscar() {
        return aBuscar;
    }

    public void setaBuscar(String [] aBuscar) {
        this.aBuscar = aBuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    
    
}
