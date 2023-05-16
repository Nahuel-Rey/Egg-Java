package entidad;

/**
 * Crear una clase Ahorcado (como el juego), la cual deberá contener como
 * atributos, un vector con la palabra a buscar, la cantidad de letras
 * encontradas y la cantidad jugadas máximas que puede realizar el usuario.
 *
 * @author elias
 */
public class Ahorcado {

    private char[] palabraAbuscar;
    private int letrasEncontradas;
    private int cantidadDeintentos;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraAbuscar, int letrasEncontradas, int cantidadDeintentos) {
        this.palabraAbuscar = palabraAbuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadDeintentos = cantidadDeintentos;
    }

    public char[] getPalabraAbuscar() {
        return palabraAbuscar;
    }

    public void setPalabraAbuscar(char[] palabraAbuscar) {
        this.palabraAbuscar = palabraAbuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadDeintentos() {
        return cantidadDeintentos;
    }

    public void setCantidadDeintentos(int cantidadDeintentos) {
        this.cantidadDeintentos = cantidadDeintentos;
    }
    
    
    
}
