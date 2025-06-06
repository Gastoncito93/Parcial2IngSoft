package parcial2ingsoft;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends UsrCuenta {
    private List<TarjetaCredito> tarjetas;
    private Wallet wallet;
    private int cantidadViajes;
    private int viajesMadrugada;

    public Pasajero(int codCuenta, String nombre, String email, String telefono, String password) {
        super(codCuenta, nombre, email, telefono, password);
        this.tarjetas = new ArrayList<>();
        this.wallet = new Wallet();
    }

    public void agregarTarjeta(TarjetaCredito tarjeta) {
        tarjetas.add(tarjeta);
    }

    public boolean tieneMedioPago() {
        return !tarjetas.isEmpty();
    }

    public void registrarViaje(LocalDateTime fechaHoraPartida) {
        cantidadViajes++;
        if (fechaHoraPartida.getHour() >= 4 && fechaHoraPartida.getHour() < 8) {
            viajesMadrugada++;
        }
        verificarBonos();
    }

    private void verificarBonos() {
        if (cantidadViajes == 8) wallet.agregarMonto(8000);
        if (cantidadViajes == 17) wallet.agregarMonto(20000);
        if (cantidadViajes == 28) wallet.agregarMonto(40000);
        if (viajesMadrugada == 4) wallet.agregarMonto(8000);
    }

    public Wallet getWallet() {
        return wallet;
    }
}
