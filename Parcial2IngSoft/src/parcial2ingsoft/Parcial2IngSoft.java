/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2ingsoft;

/**
 *
 * @author Usuario
 */
public class Parcial2IngSoft {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota", "Corolla", "Blanco");
        Wallet wallet = new Wallet();
        Conductor conductor = new Conductor(1, "Carlos", "carlos@mail.com", "123456789", "pass123",
                                            "LIC123", vehiculo, wallet);

        Pasajero pasajero = new Pasajero(2, "Ana", "ana@mail.com", "987654321", "clave123");
        Viaje viaje = new Viaje("Av. Siempre Viva 123", "Calle Falsa 456", pasajero);

        // Simular flujo de Uber Driver
        conductor.recibirSolicitud(viaje);
        conductor.verInfoViaje();
        conductor.aceptarSolicitud();
        conductor.llegarAlPasajero();
        conductor.iniciarViaje();
        conductor.realizarViaje();

        Calificacion califPasajero = new Calificacion(5, "Muy buen viaje", "06/06/2025");
        Calificacion califConductor = new Calificacion(5, "Excelente pasajero", "06/06/2025");

        conductor.finalizarViaje(califPasajero, califConductor);
    }
}
    
