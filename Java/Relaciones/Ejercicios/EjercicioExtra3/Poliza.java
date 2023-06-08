package Entidades;

import java.util.Date;
import java.util.HashMap;

public class Poliza {

    
    private HashMap<Clientes, Vehiculos> clienteVehiculo;
    private int numeroPoliza;
    private Date fechaInicio, fechaFin;
    private int cuotas;
    private String formaPago; 
    private double montoAsegurado;
    private boolean granizo;
    private double montoGranizo;
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza( HashMap<Clientes, Vehiculos> clienteVehiculo, int numeroPoliza, Date fechaInicio, Date fechaFin, int cuotas, String formaPago, double montoAsegurado, boolean granizo, double montoGranizo, String tipoCobertura) {
        this.clienteVehiculo = new HashMap();
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = new Date();
        this.fechaFin = new Date();
        this.cuotas = cuotas;
        this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public HashMap<Clientes, Vehiculos> getClienteVehiculo() {
        return clienteVehiculo;
    }

    public void setClienteVehiculo(HashMap<Clientes, Vehiculos> clienteVehiculo) {
        this.clienteVehiculo = clienteVehiculo;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "clienteVehiculo=" + clienteVehiculo + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cuotas=" + cuotas + ", formaPago=" + formaPago + ", montoAsegurado=" + montoAsegurado + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }

}
