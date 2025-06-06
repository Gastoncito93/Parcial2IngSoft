package parcial2ingsoft;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private double saldo;
    private List<String> historial;

    public Wallet() {
        this.saldo = 0;
        historial = new ArrayList<>();
    }

    public Wallet(double saldo) {
        this.saldo = saldo;
        historial = new ArrayList<>();
    }

    // Agrega monto al saldo y registra la transacción
    public void agregarMonto(double monto) {
        saldo += monto;
        historial.add("Depósito: +" + monto);
    }

    // Retira monto si hay saldo suficiente y registra la transacción
    public void retirarMonto(double monto) {
        if (tieneSaldoSuficiente(monto)) {
            saldo -= monto;
            historial.add("Retiro: -" + monto);
        } else {
            System.out.println("Error: Saldo insuficiente.");
        }
    }

    // Verifica que exista saldo suficiente para la operación
    public boolean tieneSaldoSuficiente(double monto) {
        return saldo >= monto;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public List<String> getHistorial() {
        return historial;
    }
    
    // Devuelve el saldo con formato de moneda
    public String getSaldoFormateado() {
        return String.format("$%.2f", saldo);
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "saldo=" + saldo +
                '}';
    }
}
