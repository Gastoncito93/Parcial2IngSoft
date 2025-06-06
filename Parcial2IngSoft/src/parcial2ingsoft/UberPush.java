package parcial2ingsoft;

public class UberPush {

    // Envía una notificación al conductor con la información del viaje
    public void enviarNotificacion(Conductor conductor, Viaje viaje) {
        System.out.println("Notificación: Conductor " + conductor.getNombre() +
                " con vehículo " + conductor.getVehiculo().obtenerDescripcionCompleta() +
                " tiene un nuevo viaje disponible: " + viaje.toString());
    }
}
