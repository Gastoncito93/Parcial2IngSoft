package parcial2ingsoft;

public class Viaje {
    private String pickupA;
    private String destinoB;
    private String estado; // Ej: "Pendiente", "Aceptado", "Finalizado"
    private Pasajero pasajero;
    private Conductor conductor;
    private Calificacion calificacionPasajero;
    private Calificacion calificacionConductor;

    public Viaje(String pickupA, String destinoB, Pasajero pasajero) {
        this.pickupA = pickupA;
        this.destinoB = destinoB;
        this.pasajero = pasajero;
        this.estado = "Pendiente";
    }

    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
        this.estado = "Aceptado";
    }

    public void finalizarViaje(Calificacion califPasajero, Calificacion califConductor) {
        this.estado = "Finalizado";
        this.calificacionPasajero = califPasajero;
        this.calificacionConductor = califConductor;

        pasajero.recibirCalificacion(califConductor);
        conductor.recibirCalificacion(califPasajero);
    }
    
    public String getPickupA() {
    return pickupA;
}

    public String getDestinoB() {
        return destinoB;
    }


    public void setPickupA(String pickupA) {
        this.pickupA = pickupA;
    }

    public void setDestinoB(String destinoB) {
        this.destinoB = destinoB;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Calificacion getCalificacionPasajero() {
        return calificacionPasajero;
    }

    public void setCalificacionPasajero(Calificacion calificacionPasajero) {
        this.calificacionPasajero = calificacionPasajero;
    }

    public Calificacion getCalificacionConductor() {
        return calificacionConductor;
    }

    public void setCalificacionConductor(Calificacion calificacionConductor) {
        this.calificacionConductor = calificacionConductor;
    }
    
    
}
