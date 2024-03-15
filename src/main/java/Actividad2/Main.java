package Actividad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client cliente = new Client();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Visualizar saldo de la cuenta corriente");
            System.out.println("2. Visualizar saldo de la cuenta de ahorros");
            System.out.println("3. Visualizar saldo del CDT");
            System.out.println("4. Visualizar saldo total");
            System.out.println("5. Invertir en un CDT");
            System.out.println("6. Cerrar inversión en CDT");
            System.out.println("7. Consignar en cuenta corriente");
            System.out.println("8. Retirar de cuenta corriente");
            System.out.println("9. Consignar en cuenta de ahorros");
            System.out.println("10. Retirar de cuenta de ahorros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (cliente.getCurrentAccount()!=null){
                        System.out.println("Saldo de la cuenta corriente: " + cliente.getCurrentAccount().getSaldo());
                    }else{
                        System.out.println("No hay una cuenta corriente existente");
                    }
                    break;
                case 2:
                    if (cliente.getSavingsAccounts()!=null){
                        System.out.println("Saldo de la cuenta de ahorros: " + cliente.getSavingsAccounts().getSaldo());
                    }else{
                        System.out.println("No hay una cuenta de ahorros existente");
                    }
                    break;
                case 3:
                    if (cliente.getCertificateDeposit() != null) {
                        System.out.println("Saldo del CDT: " + cliente.getCertificateDeposit().getSaldo());
                    } else {
                        System.out.println("No hay CDT abierto.");
                    }
                    break;
                case 4:
                    System.out.println("Saldo total: " + cliente.getSaldoTotal());
                    break;
                case 5:
                    System.out.print("Ingrese el monto a invertir en el CDT: ");
                    double montoCDT = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de interés del CDT: ");
                    double interesCDT = scanner.nextDouble();
                    if (montoCDT<=0 || interesCDT <= 0){
                        System.out.println("Error, verifique los datos, el saldo y los intereses deben ser mayor a 0");
                    }else {
                        cliente.abrirCDT(montoCDT, interesCDT);
                        System.out.println("Inversión en CDT realizada con éxito.");
                    }
                    break;
                case 6:
                    if (cliente.getCertificateDeposit() != null) {
                        cliente.cerrarCDT();
                        System.out.println("Inversión en CDT cerrada con éxito.");
                    } else {
                        System.out.println("No hay CDT abierto.");
                    }
                    break;
                case 7:
                    System.out.print("Ingrese el monto a consignar en cuenta corriente: ");
                    double montoCC = scanner.nextDouble();
                    if (montoCC <= 0){
                        System.out.println("Error, el monto es igual o menor a 0");
                    }
                    if (cliente.getCurrentAccount()==null){
                        System.out.println("Error, el usuario no tiene cuenta");
                    }else {
                        cliente.getCurrentAccount().depositar(montoCC);
                        System.out.println("Consignación en cuenta corriente realizada con éxito.");
                    }
                    break;
                case 8:
                    System.out.print("Ingrese el monto a retirar de cuenta corriente: ");
                    double montoRetiroCC = scanner.nextDouble();
                    if (cliente.getCurrentAccount()==null){
                        System.out.println("Error, no hay una cuenta corriente existente");
                    }else if (cliente.getCurrentAccount().getSaldo()<montoRetiroCC){
                        System.out.println("Error, el monto no es suficiente");
                    }else{
                        cliente.getCurrentAccount().retirar(montoRetiroCC);
                        System.out.println("Retiro de cuenta corriente realizado con éxito.");
                    }
                    break;
                case 9:
                    System.out.print("Ingrese el monto a consignar en cuenta de ahorros: ");
                    double montoCA = scanner.nextDouble();
                    if (cliente.getSavingsAccounts()==null){
                        System.out.println("Error, no hay una cuenta de ahorros existente");
                    }else if (montoCA > 0){
                        System.out.println("Error, el monto no es suficiente");
                    }else{
                        cliente.getSavingsAccounts().depositar(montoCA);
                        System.out.println("Consignación en cuenta de ahorros realizada con éxito.");
                    }
                    break;
                case 10:
                    System.out.print("Ingrese el monto a retirar de cuenta de ahorros: ");
                    double montoRetiroCA = scanner.nextDouble();
                    cliente.getSavingsAccounts().retirar(montoRetiroCA);
                    System.out.println("Retiro de cuenta de ahorros realizado con éxito.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}