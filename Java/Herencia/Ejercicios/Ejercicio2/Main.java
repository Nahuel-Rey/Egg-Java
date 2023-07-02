package Main;


import Servicios.LavadoraService;

import Servicios.TelevisorService;


public class Main {

    public static void main(String[] args) {

        System.out.println("Lavadora");
        LavadoraService ls = new LavadoraService();
      ls.crearLavadora();
        

        System.out.println("Televisor");
        TelevisorService ts = new TelevisorService();
        ts.crearTelevisor();
        System.out.println("El precio final del televisor es; " + ts.precioFinal());

    }
}
