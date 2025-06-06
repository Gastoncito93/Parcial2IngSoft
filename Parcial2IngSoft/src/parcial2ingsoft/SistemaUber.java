/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2ingsoft;

import java.time.LocalDateTime;
import java.util.List;

public class SistemaUber {

    private List<Conductor> conductoresDisponibles;

    public SistemaUber(List<Conductor> conductores) {
        this.conductoresDisponibles = conductores;
    }

    public Viaje pedirViaje(Pasajero pasajero, String origen, String destino, LocalDateTime partida,
                            boolean esParaOtro, String nombreInvitado) {

        if (!pasajero.tieneMedioPago()) {
            throw new RuntimeException("No se puede crear viaje: el pasajero no tiene tarjeta registrada.");
        }

        Viaje nuevo = new Viaje(pasajero, origen, destino, partida, esParaOtro, nombreInvitado);

        // Buscar conductor disponible simulado
        for (Conductor c : conductoresDisponibles) {
            if (c.isDisponible()) {
                nuevo.asignarConductor(c);
                c.setDisponible(false);
                System.out.println("Viaje confirmado con el conductor: " + c.getNombre());
                break;
            }
        }

        return nuevo;
    }
}

