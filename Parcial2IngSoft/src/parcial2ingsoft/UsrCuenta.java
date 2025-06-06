package parcial2ingsoft;

import java.util.LinkedList;
import java.util.Queue;

public abstract class UsrCuenta {
    protected int codCuenta;
    protected String nombre;
    protected String email;
    protected String telefono;
    protected String password;
    protected Queue<Integer> calificaciones; // últimas 500
    protected double promedio;

    public UsrCuenta(int codCuenta, String nombre, String email, String telefono, String password) {
        this.codCuenta = codCuenta;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
        this.calificaciones = new LinkedList<>();
        this.promedio = 5.0;
    }

    public void agregarCalificacion(int estrellas) {
        if (calificaciones.size() == 500) {
            calificaciones.poll();
        }
        calificaciones.offer(estrellas);
        recalcularPromedio();
    }

    private void recalcularPromedio() {
        int suma = calificaciones.stream().mapToInt(Integer::intValue).sum();
        this.promedio = (double) suma / calificaciones.size();
    }

    public double getPromedio() {
        return promedio;
    }

    public String getNombre() {
        return nombre;
    }
}

