package parcial2ingsoft;

public class Conductor extends UsrCuenta {
    private String nroLicencia;
    private Vehiculo vehiculo;
    private Wallet wallet;
    private Viaje viajeActual;

    public Conductor(int codCuenta, String nombre, String email, String telefono, String password,
                     String nroLicencia, Vehiculo vehiculo, Wallet wallet) {
        super(codCuenta, nombre, email, telefono, password);
        this.nroLicencia = nroLicencia;
        this.vehiculo = vehiculo;
        this.wallet = wallet;
        this.viajeActual = null;
    }

    public void recibirSolicitud(Viaje viaje) {
        System.out.println("Nueva solicitud de viaje recibida.");
        this.viajeActual = viaje;
    }

    public void verInfoViaje() {
        if (viajeActual != null) {
            System.out.println("Pickup: " + viajeActual.getPickupA());
            System.out.println("Destino: " + viajeActual.getDestinoB());
            // (Agregar tarifa estimada si el sistema la calcula)
        }
    }

    public void aceptarSolicitud() {
        if (viajeActual != null) {
            viajeActual.asignarConductor(this);
            System.out.println("Solicitud aceptada.");
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

    public void finalizarViaje(Calificacion califPasajero, Calificacion califConductor) {
        viajeActual.finalizarViaje(califPasajero, califConductor);
        System.out.println("Viaje finalizado.");
        wallet.agregarMonto(500); // ejemplo de dinero recibido
        viajeActual = null;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(String nroLicencia) {
        this.nroLicencia = nroLicencia;
    }

    public Viaje getViajeActual() {
        return viajeActual;
    }

    public void setViajeActual(Viaje viajeActual) {
        this.viajeActual = viajeActual;
    }
    
    
}


   

    

