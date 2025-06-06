package parcial2ingsoft;

import java.time.LocalDateTime;

public class Viaje {

    public enum Estado { PENDIENTE, CONFIRMADO, CONCLUIDO, CANCELADO }

    private Conductor conductor;
    private String pickupA;
    private String destinoB;
    private Estado estado;
    private LocalDateTime fechaHoraPartida;
    private LocalDateTime fechaHoraLlegadaEstimada;
    private double monto;
    private Pasajero pasajero;
    private double distancia; // km
    private double duracion; // minutos
    private boolean esParaOtro;
    private String nombreInvitado;
    
    
    
    
   
    

    public Viaje(Pasajero pasajero, String pickupA, String destinoB, LocalDateTime fechaHoraPartida,
                 boolean esParaOtro, String nombreInvitado) {
        this.pasajero = pasajero;
        this.pickupA = pickupA;
        this.destinoB = destinoB;
        this.fechaHoraPartida = fechaHoraPartida;
        this.estado = Estado.PENDIENTE;
        this.esParaOtro = esParaOtro;
        this.nombreInvitado = nombreInvitado;

        calcularRutaYPrecio();
    }

    private void calcularRutaYPrecio() {
        this.distancia = 10; // Simulado
        this.duracion = 20;
        this.fechaHoraLlegadaEstimada = fechaHoraPartida.plusMinutes((long) duracion);
        double tarifaBase = 500;
        double tarifaKm = 80;
        double tarifaMin = 30;
        double cargoDemanda = obtenerCargoPorFranja(fechaHoraPartida.getHour());
        this.monto = tarifaBase + (tarifaKm * distancia) + (tarifaMin * duracion) + cargoDemanda;
    }

    private double obtenerCargoPorFranja(int hora) {
        if (hora >= 7 && hora < 13) return 900;
        if (hora >= 13 && hora < 19) return 1300;
        if (hora >= 19 || hora < 1) return 700;
        return 1250; // madrugada
    }

    public void asignarConductor(Conductor c) {
        this.conductor = c;
        this.estado = Estado.CONFIRMADO;
    }

    public void finalizar() {
        this.estado = Estado.CONCLUIDO;
        pasajero.registrarViaje(fechaHoraPartida);
        conductor.getWallet().agregarMonto(monto);
    }

    public void cancelar(boolean penalizado) {
        this.estado = Estado.CANCELADO;
        if (penalizado) {
            System.out.println("Se aplica penalización por cancelación.");
        }
    }

    public double getMonto() {
        return monto;
    }

    public Estado getEstado() {
        return estado;
    }
}
