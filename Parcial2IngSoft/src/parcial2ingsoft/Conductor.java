package parcial2ingsoft;

public class Conductor extends UsrCuenta {
    private String nroLicencia;
    private Vehiculo vehiculo;
    private Wallet wallet;

    public Conductor(int codCuenta, String nombre, String email, String telefono, String password,
                     String nroLicencia, Vehiculo vehiculo, Wallet wallet) {
        super(codCuenta, nombre, email, telefono, password);
        this.nroLicencia = nroLicencia;
        this.vehiculo = vehiculo;
        this.wallet = wallet;
    }

    public Conductor(int codCuenta, String nombre, String email, String telefono, String password) {
        super(codCuenta, nombre, email, telefono, password);
    }

    public String getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(String nroLicencia) {
        this.nroLicencia = nroLicencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nroLicencia=" + nroLicencia + ", vehiculo=" + vehiculo + ", wallet=" + wallet + '}';
    }

    
}
