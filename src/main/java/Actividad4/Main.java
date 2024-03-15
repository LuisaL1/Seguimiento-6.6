package Actividad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del concesionario: ");
        String nombreConcesionario = scanner.nextLine();
        System.out.print("Ingrese la dirección del concesionario: ");
        String direccionConcesionario = scanner.nextLine();

        Concessionaire concessionaire = new Concessionaire(nombreConcesionario, direccionConcesionario);

        int opcion;
        do {

            System.out.println("\nMenú:");
            System.out.println("1. Agregar carros");
            System.out.println("2. Vender carro");
            System.out.println("3. Mostrar cantidad de carros disponibles");
            System.out.println("4. Mostrar información del concesionario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de carros a agregar: ");
                    int cantidadAgregar = scanner.nextInt();
                    concessionaire.agregarCarro(cantidadAgregar);
                    System.out.println("Se agregaron " + cantidadAgregar + " carros al concesionario.");
                    break;
                case 2:
                    // Pedir al usuario la cantidad de carros a vender
                    System.out.print("Ingrese la cantidad de carros a vender: ");
                    int cantidadVender = scanner.nextInt();
                    if (concessionaire.venderCarro(cantidadVender)) {
                        System.out.println("Se vendieron " + cantidadVender + " carros.");
                    } else {
                        System.out.println("No hay suficientes carros disponibles para vender.");
                    }
                    break;
                case 3:
                    concessionaire.mostrarCarros();
                    break;
                case 4:
                    System.out.println(concessionaire.getInfo());
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}