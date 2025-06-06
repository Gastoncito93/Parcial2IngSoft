package parcial2ingsoft;

import java.util.ArrayList;
import java.util.List;

public class Pasajero extends UsrCuenta {
    private List<TarjetaCredito> tarjetas;

    public Pasajero(int codCuenta, String nombre, String email, String telefono, String password) {
        super(codCuenta, nombre, email, telefono, password);
        this.tarjetas = new ArrayList<>();
    }

    public void agregarTarjeta(TarjetaCredito tarjeta) {
        tarjetas.add(tarjeta);
    }

    public List<TarjetaCredito> getTarjetas() {
        return tarjetas;
    }

    public int getCodCuenta() {
        return codCuenta;
    }

    public void setCodCuenta(int codCuenta) {
        this.codCuenta = codCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getPromedioCalificacion() {
        return promedioCalificacion;
    }

    public void setPromedioCalificacion(double promedioCalificacion) {
        this.promedioCalificacion = promedioCalificacion;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "tarjetas=" + tarjetas + '}';
    }
    
    
}
