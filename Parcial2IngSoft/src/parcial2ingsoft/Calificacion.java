package parcial2ingsoft;

public class Calificacion {
    private int puntaje; // Valor entre 1 y 5
    private String comentario;
    private String fecha;

    public Calificacion(int puntaje, String comentario, String fecha) {
        this.puntaje = puntaje;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public Calificacion() {
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Verifica que el puntaje sea válido (entre 1 y 5)
    public boolean esValida() {
        return puntaje >= 1 && puntaje <= 5;
    }
    
    @Override
    public String toString() {
        return "Calificacion{" +
                "puntaje=" + puntaje +
                ", comentario='" + comentario + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
