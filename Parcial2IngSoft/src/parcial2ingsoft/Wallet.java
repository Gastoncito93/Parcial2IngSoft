package parcial2ingsoft;

public class Wallet {
    private double saldo;

    public Wallet() {
        this.saldo = 0;
    }

    public void agregarMonto(double monto) {
        saldo += monto;
    }

    public void retirarMonto(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public Wallet(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Wallet{" + "saldo=" + saldo + '}';
    }
    
    
}
