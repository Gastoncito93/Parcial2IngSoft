package parcial2ingsoft;

public class Conductor extends UsrCuenta {
    private String nroLicencia;
    private Vehiculo vehiculo;
    private Wallet wallet;
    private Viaje viajeActual;
    private boolean disponible;

    public Conductor(int codCuenta, String nombre, String email, String telefono, String password,
                     String nroLicencia, Vehiculo vehiculo, Wallet wallet) {
        super(codCuenta, nombre, email, telefono, password);
        this.nroLicencia = nroLicencia;
        this.vehiculo = vehiculo;
        this.wallet = wallet;
        this.viajeActual = null;
        this.disponible = true;
    }

    public Conductor() {
        super();
        this.disponible = true;
    }

    // Recibe una solicitud de viaje
    public void recibirSolicitud(Viaje viaje) {
        System.out.println("Nueva solicitud de viaje recibida.");
        this.viajeActual = viaje;
    }

    // Muestra información del viaje actual
    public void verInfoViaje() {
        if (viajeActual != null) {
            System.out.println("Pickup: " + viajeActual.getPickupA());
            System.out.println("Destino: " + viajeActual.getDestinoB());
            // Se podría agregar tarifa estimada u otra info adicional.
        }
    }

    // Acepta la solicitud y asigna el viaje
    public void aceptarSolicitud() {
        if (viajeActual != null && disponible) {
            viajeActual.asignarConductor(this);
            System.out.println("Solicitud aceptada.");
            this.disponible = false;
        }
    }
    
    // Cancela la solicitud actual
    public void cancelarSolicitud() {
        if (viajeActual != null) {
            viajeActual.setEstado("Cancelado");
            System.out.println("Solicitud cancelada por el conductor.");
            this.viajeActual = null;
            this.disponible = true;
        }
    }

    public void llegarAlPasajero() {
        System.out.println("Llegaste al punto de recogida.");
    }

    public void iniciarViaje() {
        System.out.println("Viaje iniciado.");
    }

    public void realizarViaje() {
        System.out.println("Conduciendo hacia el destino...");
    }

    // Finaliza el viaje, registra las calificaciones y actualiza el wallet
    public void finalizarViaje(Calificacion califPasajero, Calificacion califConductor) {
        if (viajeActual != null) {
            viajeActual.finalizarViaje(califPasajero, califConductor);
            System.out.println("Viaje finalizado.");
            wallet.agregarMonto(500); // Ejemplo de monto depositado
            viajeActual = null;
            this.disponible = true;
        }
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

    public Viaje getViajeActual() {
        return viajeActual;
    }

    public void setViajeActual(Viaje viajeActual) {
        this.viajeActual = viajeActual;
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nroLicencia='" + nroLicencia + '\'' +
                ", vehiculo=" + vehiculo +
                ", wallet=" + wallet +
                ", promedioCalificacion=" + promedioCalificacion +
                ", " + super.toString() +
                '}';
    }
}
