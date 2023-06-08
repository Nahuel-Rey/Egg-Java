
package Entidades;


public class Vehiculos {
    
    private String marca;
    private String modelo;
    private int anio;
    private long numeroMotor;
    private long chasis;
    private String color;
    private String tipo;

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, int anio, long numeroMotor, long chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public long getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(long numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public long getChasis() {
        return chasis;
    }

    public void setChasis(long chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }

}
