/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2ingsoft;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Parcial2IngSoft {

    public static void main(String[] args) {
        // Crear pasajero
        Pasajero ana = new Pasajero(1, "Ana López", "ana@mail.com", "1122334455", "clave123");
        ana.agregarTarjeta(new TarjetaCredito("1234567890123456", "Ana López", "12/26", "123"));

        // Crear vehículo y conductor
        Vehiculo auto1 = new Vehiculo("AB123CD", "Toyota", "Corolla", "Blanco");
        Conductor carlos = new Conductor(2, "Carlos Pérez", "carlos@uber.com", "1199988877", "clave456", "LIC001", auto1);

        // Lista de conductores disponibles
        List<Conductor> conductores = new ArrayList<>();
        conductores.add(carlos);

        // Crear sistema centralizado
        SistemaUber uber = new SistemaUber(conductores);

        // Simular pedido de viaje (7:30am con cargo de $900 y es en la madrugada)
        LocalDateTime salida = LocalDateTime.of(2025, 6, 7, 7, 30); // 7:30 hs
        Viaje viaje = uber.pedirViaje(ana, "Av. Siempre Viva 742", "Calle Falsa 123", salida, false, "");

        System.out.println("Monto calculado del viaje: $" + viaje.getMonto());
        System.out.println("Estado del viaje: " + viaje.getEstado());

        // Finalizar viaje
        viaje.finalizar();

        // Calificaciones
        ana.agregarCalificacion(5);
        carlos.agregarCalificacion(4);

        System.out.println("Promedio pasajero Ana: " + ana.getPromedio());
        System.out.println("Promedio conductor Carlos: " + carlos.getPromedio());

        // Mostrar saldo de wallets
        System.out.println("Wallet conductor Carlos: $" + carlos.getWallet().getSaldo());
        System.out.println("Wallet pasajero Ana: $" + ana.getWallet().getSaldo());
    }
        
    }
    
