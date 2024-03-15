package Actividad2;

public class CurrentAccount extends Account {
    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        saldo -= monto;
    }
}
