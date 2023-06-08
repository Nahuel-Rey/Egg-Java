package Servicio;

import Entidades.Clientes;
import Entidades.Cuotas;
import Entidades.Poliza;
import Entidades.Vehiculos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GestionPolizas {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Poliza> polizas = new ArrayList();
    private ArrayList<Cuotas> listaCuotas = new ArrayList();
    private Random random = new Random();

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public Poliza creacionPoliza(Clientes cliente, Vehiculos vehiculo) throws ParseException {
        Poliza poliza = new Poliza();
        HashMap<Clientes, Vehiculos> clienteVehiculo = new HashMap();
        Date fechaAlta = new Date();
        System.out.println("Ingrese los datos de la poliza para el cliente " + cliente.getNombreApellido());

        System.out.println("Numero de poliza:");
        poliza.setNumeroPoliza(leer.nextInt());
        System.out.println("Fecha de inicio (se toma la fecha de alta por sistema):");
        poliza.setFechaInicio(fechaAlta);

        System.out.println("Ingrese la fecha de fin de cobertura (formato aaaa/mm/dd):");
        String fechaFin = leer.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date fechaFinal = dateFormat.parse(fechaFin);
        poliza.setFechaFin(fechaFinal);

        System.out.println("Cantidad Cuotas: ");
        poliza.setCuotas(leer.nextInt());
        System.out.println("Forma de pago: QUINCENAL / MENSUAL / ANUAL");
        poliza.setFormaPago(leer.next());
        System.out.println("Monto asegurado: $");
        poliza.setMontoAsegurado(leer.nextDouble());

        System.out.println("Tiene cobertura contra granizo? : S/N ");
        String opcion = leer.next();
        poliza.setGranizo(opcion.equalsIgnoreCase("S"));
        if (poliza.isGranizo()) {
            System.out.println("Monto cobertura contra granizo");
            poliza.setMontoGranizo(leer.nextDouble());
        } else {
            poliza.setMontoGranizo(0);
        }
        System.out.println("Tipo de cobertura: ");
        poliza.setTipoCobertura(leer.next());

        clienteVehiculo.put(cliente, vehiculo);
        poliza.setClienteVehiculo(clienteVehiculo);

        polizas.add(poliza);
        gestionCuotas(poliza.getCuotas());
        return poliza;
    }

    public void gestionCuotas(int cantidadCuotas) {
        for (Poliza poliza : polizas) {
            System.out.println("Número de póliza: " + poliza.getNumeroPoliza());
            System.out.println("Cantidad de cuotas: " + poliza.getCuotas());
            System.out.println("Forma de pago: " + poliza.getFormaPago());

            for (int i = 0; i < cantidadCuotas; i++) {
                Cuotas cuotas = new Cuotas();

                cuotas.setNumeroCuota(i + 1);

                double montoCuota = (poliza.getMontoAsegurado() / cantidadCuotas) * 1.1;
                cuotas.setMontoCuota(montoCuota);

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(poliza.getFechaInicio());
                calendar.add(Calendar.MONTH, cuotas.getNumeroCuota());
                cuotas.setVencimiento(calendar.getTime());

                boolean pagada = random.nextInt(21) > 10;
                cuotas.setPagada(pagada);

                int aux = random.nextInt(3);
                String[] formasPago = {"Contado", "Transferencia", "Tarjeta de crédito"};
                String formaPago = formasPago[aux];
                cuotas.setFormaPago(formaPago);

                System.out.println("Cuota nro: " + cuotas.getNumeroCuota());
                System.out.println("El monto de la cuota es: " + cuotas.getMontoCuota());
                System.out.println("Pagada " + cuotas.isPagada());
                System.out.println("Vencimiento: " + cuotas.getVencimiento());
                System.out.println("Forma de pago: " + cuotas.getFormaPago());
                
                listaCuotas.add(cuotas);
            }
            System.out.println();
        }
    }

    public void mostrarPolizas() {
        System.out.println("Registro de polizas");
        for (Poliza poliza : polizas) {
            System.out.println(poliza);
        }
    }

    public void mostraEstadoCuotas() {
        
        for (Cuotas aux: listaCuotas) {
            
            System.out.println("Número de cuota: " + aux.getNumeroCuota());
            System.out.println("Pagada: " + aux.isPagada());
            System.out.println("Vencimiento: " + aux.getVencimiento());
            System.out.println("Forma de pago: " + aux.getFormaPago());
            System.out.println();
        }
    }
    
}


