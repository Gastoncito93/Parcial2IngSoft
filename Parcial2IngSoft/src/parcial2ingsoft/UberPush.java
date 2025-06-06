package parcial2ingsoft;

public class UberPush {
    
    
    public void enviarNotificacion(Conductor conductor, Viaje viaje) {
        System.out.println("Conductor " + conductor.getVehiculo().toString()
                + " tiene un nuevo viaje disponible: " + viaje);
    }
    
    
}

