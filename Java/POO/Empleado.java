/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtras.Clases;

import java.util.Scanner;

/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcular_aumento() {
        Scanner leer = new Scanner(System.in);
        double aumentoSalario;
        System.out.println("Ingrese el nombre del empleado");
        this.nombre = leer.next();
        System.out.println("Ingrese la edad");
        this.edad = leer.nextInt();
        System.out.println("Ingrese el salario");
        this.salario = leer.nextDouble();

        if (this.edad < 30) {
            aumentoSalario = salario * 0.05;
        } else {
            aumentoSalario = salario * 0.1;
        }

        salario += aumentoSalario;
        System.out.println("Nombre = " + nombre + " || Edad =  " + edad + " || Salario con aumento = " + salario);
    }

}
