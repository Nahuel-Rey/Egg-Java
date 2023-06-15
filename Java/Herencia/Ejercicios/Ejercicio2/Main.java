package Main;


import Servicios.LavadoraServicio;
import Servicios.TelevisorService;


public class Main {

    public static void main(String[] args) {

        System.out.println("Lavadora");
        LavadoraServicio ls = new LavadoraServicio();
      ls.crearLavadora();
        System.out.println("El precio final de la lavadora es: " + ls.precioFinalLavadora());

        System.out.println("Televisor");
        TelevisorService ts = new TelevisorService();
        ts.crearTelevisor();
        System.out.println("El precio final del televisor es; " + ts.precioFinal());

    }
}
