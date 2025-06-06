package parcial2ingsoft;

public abstract class UsrCuenta {
    protected int codCuenta;
    protected String nombre;
    protected String email;
    protected String telefono;
    protected String password;
    protected double promedioCalificacion;

    public UsrCuenta(int codCuenta, String nombre, String email, String telefono, String password) {
        this.codCuenta = codCuenta;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
        this.promedioCalificacion = 0.0;
    }

    public void recibirCalificacion(Calificacion calificacion) {
        // método simple para modificar promedio (a completar si se quiere acumular)
        this.promedioCalificacion = calificacion.getPuntaje();
    }

    public UsrCuenta() {
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
        return "UsrCuenta{" + "codCuenta=" + codCuenta + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + ", password=" + password + ", promedioCalificacion=" + promedioCalificacion + '}';
    }

    
}

