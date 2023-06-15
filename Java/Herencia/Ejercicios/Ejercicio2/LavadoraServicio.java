/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import java.util.Scanner;


public class LavadoraServicio extends ElectrodomesticoService{
    
protected Electrodomesticos maquina = crearElectrodomestico();
    protected Scanner leer = new Scanner(System.in);
    protected Lavadora lavadora = new Lavadora();

    /*
    MÃ©todo crearLavadora (): este mÃ©todo llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y despuÃ©s llenamos
el atributo propio de la lavadora.
     */
    public Lavadora crearLavadora() {
        
        System.out.println("Ingrese la carga");
        lavadora.setCarga(leer.nextInt());
        
        lavadora.setColor(maquina.getColor());
        lavadora.setConsumoEnergetico(maquina.getConsumoEnergetico());
        lavadora.setPeso(maquina.getPeso());
        lavadora.setPrecio(super.precioFinal());
        
        return lavadora;
    }

    /*
    MÃ©todo precioFinal():este mÃ©todo serÃ¡ heredado y se le sumarÃ¡ la siguiente funcionalidad. Si tiene
 * una carga mayor de 30 kg, aumentarÃ¡ el precio en $500, si la carga es menor o
 * igual, no se incrementarÃ¡ el precio. Este mÃ©todo debe llamar al mÃ©todo padre
 * y aÃ±adir el cÃ³digo necesario. Recuerda que las condiciones que hemos visto en
 * la clase ElectrodomÃ©stico tambiÃ©n deben afectar al precio.
     */
    public double precioFinalLavadora() {
        System.out.println(lavadora.getCarga());
        if (lavadora.getCarga() > 30) {
            lavadora.setPrecio(lavadora.getPrecio() + 500);
        }
        return lavadora.getPrecio();
    }
    
}

