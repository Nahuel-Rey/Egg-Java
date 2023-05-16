
package main.entidades;

import java.util.Random;


public class MesSecreto {
    public String[] mes = {"enero","febrero","marzo", "abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    public String mesSecreto ;

    public MesSecreto() {
    }

    public MesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

  
   
}
