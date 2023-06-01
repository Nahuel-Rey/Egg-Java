package Servicios;

import Entidades.Baraja;
import Entidades.Cartas;
import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {

    private Baraja mazoInicial = new Baraja();
    private Baraja cartasEntregadas = new Baraja();
    private Collections c;
    Scanner leer = new Scanner(System.in);

    public Baraja crearMazo() {
        ArrayList<Cartas> carta = new ArrayList();
        ArrayList<Cartas> sinRepartir = new ArrayList();
        cartasEntregadas.setCartas(sinRepartir);
        for (Palo aux : Palo.values()) {
            String palo = aux.getNombre();

            for (int i = 0; i < 12; i++) {
                if (i + 1 == 8 || i + 1 == 9) {
                    continue;
                } else {
                    Cartas cartas = new Cartas(i + 1, aux);
                    carta.add(cartas);
                }
            }
        }
        mazoInicial.setCartas(carta);
        System.out.println("Baraja iniciada");
        return mazoInicial;

    }

    public void barajar() {
        c.shuffle(mazoInicial.getCartas());
    }

    public Cartas siguienteCarta() {
        Cartas c = mazoInicial.getCartas().get(0);
        System.out.println("La siguiente carta es : " + mazoInicial.getCartas().get(0).toString());
        return c;
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles" + mazoInicial.getCartas().size());
    }

    public void darCartas() {
        System.out.println("Cuantas cartas quiere?");
        int cantidad = leer.nextInt();
        if (cantidad <= mazoInicial.getCartas().size()) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Se entrega " + mazoInicial.getCartas().get(i).toString());
            }
            for (int i = 0; i < cantidad; i++) {
                cartasEntregadas.getCartas().add(mazoInicial.getCartas().get(0));
                mazoInicial.getCartas().remove(0);
            }
        } else {
            System.out.println("No hay suficientes cartas");
            cartasDisponibles();
        }

    }

    public void cartasMonton() {
        if (cartasEntregadas.getCartas().isEmpty()) {
            System.out.println("Aun no se repartieron cartas");
        } else {
            System.out.println("Se repartieron " + cartasEntregadas.getCartas());
        }
    }

    public void mostrarBaraja() {
        if (cartasEntregadas.getCartas().isEmpty()) {
            System.out.println("No quedan cartas en el mazo");
        } else {
            System.out.println(mazoInicial.getCartas().toString());
        }
    }

    public void menu() {
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Barajar el mazo");
        System.out.println("2. Ver siguiente carta");
        System.out.println("3. Pedir cartas");
        System.out.println("4. Ver cartas ya usadas");
        System.out.println("5. Ver cartas aún en el mazo");
        System.out.println("6. Salir del programa");
        System.out.println("");
        String opc = leer.next();
        switch (opc) {
            case "1":
                barajar();
                System.out.println("Mazo barajado");
                menu();
                break;
            case "2":
                siguienteCarta();
                menu();
                break;
            case "3":
                darCartas();
                menu();
                break;
            case "4":
                cartasMonton();
                menu();
                break;
            case "5":
                mostrarBaraja();
                menu();
                break;
            case "6":
                System.out.println("Ejecución finalizada");
                break;
            default:
                System.out.println("Opcion no válida");
                ;
                menu();
        }
    }
}
