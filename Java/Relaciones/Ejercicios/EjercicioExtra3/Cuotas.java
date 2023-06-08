
package Entidades;

import java.util.Date;


public class Cuotas {
    
    private int numeroCuota;
    private double montoCuota;
    private boolean pagada;
    private Date vencimiento;
    private String formaPago;

    public Cuotas() {
    }

    public Cuotas(int numeroCuota, double montoCuota, boolean pagada, Date vencimiento, String formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoCuota = montoCuota;
        this.pagada = pagada;
        this.vencimiento = vencimiento;
        this.formaPago = formaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "numeroCuota=" + numeroCuota + ", montoCuota=" + montoCuota + ", pagada=" + pagada + ", vencimiento=" + vencimiento + ", formaPago=" + formaPago + '}';
    }

    
    
}
