package Actividad2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Account> accounts;
    private CertificateDeposit certificateDeposit;

    public Client() {
        accounts = new ArrayList<>();
        accounts.add(new CurrentAccount());
        accounts.add(new SavingsAccounts());
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void setCertificateDeposit(CertificateDeposit certificateDeposit) {
        this.certificateDeposit = certificateDeposit;
    }

    public double getSaldoTotal() {
        double total = 0;
        for (Account account : accounts) {
            total += account.getSaldo();
        }
        if (certificateDeposit != null) {
            total += certificateDeposit.getSaldo();
        }
        return total;
    }

    public Account getCurrentAccount() {
        // Implementa la lógica para obtener la cuenta corriente actual
        for (Account account : accounts) {
            if (account instanceof CurrentAccount) {
                return account;
            }
        }
        return null;
    }

    public Account getSavingsAccounts() {
        // Implementa la lógica para obtener la cuenta de ahorros actual
        for (Account account : accounts) {
            if (account instanceof SavingsAccounts) {
                return account;
            }
        }
        return null;
    }

    public CertificateDeposit getCertificateDeposit() {
        // Implementa la lógica para obtener el depósito a plazo fijo actual
        return certificateDeposit;
    }

    public void abrirCDT(double monto, double interes) {
        certificateDeposit = new CertificateDeposit(monto, interes);
    }

    public void cerrarCDT() {
        double monto = certificateDeposit.cerrar();
        // Implementa la lógica para depositar el monto cerrado en una cuenta específica
    }


}