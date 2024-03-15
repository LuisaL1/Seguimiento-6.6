package Actividad2;

public abstract class Account implements AccountOperations {
    protected double saldo;

    @Override
    public double getSaldo() {
        return saldo;
    }
}


