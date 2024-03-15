package Actividad2;

public class SavingsAccounts extends Account {
    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        saldo -= monto;
    }

    public void aplicarInteres() {
        saldo += saldo * 0.006;
    }
}