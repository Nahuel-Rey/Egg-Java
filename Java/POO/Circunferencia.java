/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPOO.Circunferencia;

import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class Circunferencia {
    //Atributo
    private double radio;
    
//Constructor con radio como parametro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    //Metodo set para radio
    public void setRadio(double radio){
        this.radio = radio;
    }
//Metodo get
    public double getRadio() {
        return radio;
    }
    //Metodo crear circunferencia
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        double radio;
        System.out.println("introduzca el radio de  la circunferencia :");
        radio = leer.nextDouble();
        this.radio = radio;
        
    }
    //Metodo area
    public double area() {
        return Math.PI * Math.pow(radio, 2) ;
    }
    //Metodo perimetro
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
}

