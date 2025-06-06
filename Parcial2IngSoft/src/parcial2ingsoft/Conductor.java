package parcial2ingsoft;

public class Conductor extends UsrCuenta {
    private String nroLicencia;
    private Vehiculo vehiculo;
    private Wallet wallet;
    private boolean disponible;

    public Conductor(int codCuenta, String nombre, String email, String telefono, String password,
                     String nroLicencia, Vehiculo vehiculo) {
        super(codCuenta, nombre, email, telefono, password);
        this.nroLicencia = nroLicencia;
        this.vehiculo = vehiculo;
        this.wallet = new Wallet();
        this.disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Wallet getWallet() {
        return wallet;
    }
}
