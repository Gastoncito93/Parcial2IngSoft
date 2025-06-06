package parcial2ingsoft;

public class Viaje {
    private String pickupA;
    private String destinoB;
    private String estado; // Ej: "Pendiente", "Aceptado", "Finalizado", "Cancelado"
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
    
    public Viaje() {
    }

    public String getPickupA() {
        return pickupA;
    }

    public void setPickupA(String pickupA) {
        this.pickupA = pickupA;
    }

    public String getDestinoB() {
        return destinoB;
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

    // Asigna un conductor al viaje y actualiza el estado
    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
        this.estado = "Aceptado";
    }

    // Finaliza el viaje y registra las calificaciones correspondientes
    public void finalizarViaje(Calificacion califPasajero, Calificacion califConductor) {
        this.estado = "Finalizado";
        this.calificacionPasajero = califPasajero;
        this.calificacionConductor = califConductor;

        pasajero.recibirCalificacion(califConductor);
        conductor.recibirCalificacion(califPasajero);
    }
    
    // Permite cancelar el viaje con un motivo
    public void cancelarViaje(String motivo) {
        this.estado = "Cancelado";
        System.out.println("Viaje cancelado: " + motivo);
    }
    
    // Calcula la tarifa del viaje según la fórmula:
    // Precio = Tarifa Base + (Tarifa por Distancia * Distancia) + (Tarifa por Tiempo * Tiempo) + Cargo por Demanda
    public double calcularTarifa(double tarifaBase, double tarifaDistancia, double distancia, double tarifaTiempo, double tiempo, double cargoDemanda) {
        return tarifaBase + (tarifaDistancia * distancia) + (tarifaTiempo * tiempo) + cargoDemanda;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Viaje{");
        sb.append("pickupA='").append(pickupA).append('\'');
        sb.append(", destinoB='").append(destinoB).append('\'');
        sb.append(", estado='").append(estado).append('\'');
        sb.append(", pasajero=").append(pasajero.getNombre());
        if (conductor != null) {
            sb.append(", conductor=").append(conductor.getNombre());
        }
        sb.append('}');
        return sb.toString();
    }
}
