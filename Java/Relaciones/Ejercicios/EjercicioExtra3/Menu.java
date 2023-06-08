package Servicio;

import Entidades.Clientes;
import Entidades.Vehiculos;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private GestionClientes gc = new GestionClientes();
    private GestionPolizas gp = new GestionPolizas();

    public void menu() {
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Alta de Clientes");
        System.out.println("2. Ver listado de clientes");
        System.out.println("3. Ver listado de vehiculos");
        System.out.println("4. Gestion de polizas");
        System.out.println("5. Ver polizas");
        System.out.println("6.Estado de cuotas");
        System.out.println("7.Salir");
        System.out.println("");
        String opc = leer.next();
        switch (opc) {
            case "1":
                gc.cargaClientes();
                menu();
                break;
            case "2":
                gc.mostrarClientes();
                menu();
                break;
            case "3":
                gc.mostrarVehiculo();
                menu();
                break;
            case "4":
                gc.mostrarClientes();
                System.out.println("Ingrese el numero de cliente para asociar la poliza");
                int numeroCliente = leer.nextInt();
                Clientes cliente = gc.obtenerCliente(numeroCliente);
                if (cliente != null) {
                    gc.mostrarVehiculo();
                    System.out.println("Ingrese el numero de vehiculo para asociar a la poliza");
                    int numeroVehiculo = leer.nextInt();
                    Vehiculos vehiculo = gc.obtenerVehiculos().get(numeroVehiculo - 1);
                    if (vehiculo != null) {
                        try {
                            gp.creacionPoliza(cliente, vehiculo);
                        } catch (ParseException e) {
                            System.out.println("Error en el formato de fecha.");
                        }
                    } else {
                        System.out.println("No se encontro el vehiculo");
                    }

                } else {
                    System.out.println("No se encontro el cliente");
                }

                menu();
                break;
            case "5":
                gp.mostrarPolizas();
                menu();
                break;
            case "6":
                gp.mostraEstadoCuotas();
                break;
            case "7":
                System.out.println("Ejecución finalizada");
                break;
            default:
                System.out.println("Opcion no válida");
                ;
                menu();
        }
    }
}
