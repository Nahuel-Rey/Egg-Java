package Servicio;

import Entidades.Clientes;
import Entidades.Poliza;
import Entidades.Vehiculos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionClientes {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Clientes> clientes = new ArrayList();
    private HashMap<Clientes, Vehiculos> vehiculos = new HashMap();
    private GestionPolizas gp = new GestionPolizas();

    public Clientes creacionClientes() {
        Clientes cliente = new Clientes();

        System.out.println("Nombre y Apellido");
        cliente.setNombreApellido(leer.next());
        System.out.println("Documento");
        cliente.setDocumento(leer.nextLong());
        System.out.println("Mail");
        cliente.setMail(leer.next());
        System.out.println("Domicilio");
        cliente.setDomicilio(leer.next());
        System.out.println("Telefono");
        cliente.setTelefono(leer.nextLong());

        return cliente;
    }

    public void cargaClientes() {
        System.out.println("Bienvenido al programa de gestion de clientes.");
        System.out.println(" ");
        System.out.println("Por favor ingrese los datos solicitados");
        System.out.println(" ");
        System.out.println("Cantidad de clientes a cargar");
        int cantidadClientes = leer.nextInt();
        for (int i = 0; i < cantidadClientes; i++) {
            System.out.println("Cliente " + (i + 1));
            clientes.add( creacionClientes());
            cargaVehiculos(clientes.get(i));
        }
    }

    public Vehiculos cargaVehiculos(Clientes cliente) {
        Vehiculos vehiculo = new Vehiculos();
        System.out.println("Ingrese el vehiculo del cliente " + cliente.getNombreApellido());
        System.out.println(" ");
        System.out.println("Marca:");
        vehiculo.setMarca(leer.next());
        System.out.println("Modelo:");
        vehiculo.setModelo(leer.next());
        System.out.println("Año:");
        vehiculo.setAnio(leer.nextInt());
        System.out.println("Numero de motor:");
        vehiculo.setNumeroMotor(leer.nextLong());
        System.out.println("Chasis:");
        vehiculo.setChasis(leer.nextLong());
        System.out.println("Color:");
        vehiculo.setColor(leer.next());
        System.out.println("Tipo de vehiculo:");
        vehiculo.setTipo(leer.next());

        vehiculos.put(cliente, vehiculo);
        return vehiculo;

    }

    public void mostrarClientes() {
        System.out.println(" Registro de clientes");
        for (Clientes aux : clientes) {
            System.out.println(aux);
        }
    }

    public void mostrarVehiculo() {
        System.out.println("Registro de Vehiculos");
        for (Map.Entry<Clientes, Vehiculos> entry : vehiculos.entrySet()) {
            Clientes key = entry.getKey();
            Vehiculos value = entry.getValue();
            System.out.println("Vehiculo: " + value);
        }
    }

    public Clientes obtenerCliente(int cliente) {
        if (cliente >= 1 && cliente <= clientes.size()) {
            return clientes.get(cliente - 1);
        }
        return null;
    }



 public ArrayList<Vehiculos> obtenerVehiculos() {
        ArrayList<Vehiculos> listaVehiculos = new ArrayList<>();
        for (Vehiculos vehiculo : vehiculos.values()) {
            listaVehiculos.add(vehiculo);
        }
        return listaVehiculos;
    }
}
