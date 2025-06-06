package parcial2ingsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class UsrCuenta {
    protected int codCuenta;
    protected String nombre;
    protected String email;
    protected String telefono;
    protected String password;
    protected double promedioCalificacion;
    protected List<Calificacion> calificaciones;

    public UsrCuenta(int codCuenta, String nombre, String email, String telefono, String password) {
        this.codCuenta = codCuenta;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
        this.promedioCalificacion = 0.0;
        this.calificaciones = new ArrayList<>();
    }

    public UsrCuenta() {
        this.calificaciones = new ArrayList<>();
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

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    // Agrega una calificación a la lista y actualiza el promedio
    public void recibirCalificacion(Calificacion calificacion) {
        if (calificacion != null && calificacion.esValida()) {
            calificaciones.add(calificacion);
            actualizarPromedioCalificacion();
        }
    }

    // Recalcula el promedio de las calificaciones almacenadas
    private void actualizarPromedioCalificacion() {
        int total = 0;
        for (Calificacion cal : calificaciones) {
            total += cal.getPuntaje();
        }
        int count = calificaciones.size();
        this.promedioCalificacion = count > 0 ? (double) total / count : 0;
    }
    
    // Valida la contraseña ingresada
    public boolean validarPassword(String password) {
        return this.password.equals(password);
    }

    // Valida el formato del email usando una expresión regular
    public boolean validarEmail() {
        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(this.email);
        return matcher.find();
    }

    @Override
    public String toString() {
        return "UsrCuenta{" +
                "codCuenta=" + codCuenta +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", password='" + password + '\'' +
                ", promedioCalificacion=" + promedioCalificacion +
                '}';
    }
}
