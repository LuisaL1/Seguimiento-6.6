package Actividad2;

public class CertificateDeposit {
    private double saldo;
    private double interes;

    public CertificateDeposit(double monto, double interes) {
        this.saldo = monto;
        this.interes = interes;
    }

    public double cerrar() {
        double monto = saldo;
        saldo = 0;
        return monto + monto * interes;
    }

    public double getSaldo() {
        return saldo;
    }
}