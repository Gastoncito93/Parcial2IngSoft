/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2ingsoft;

public class Calificacion {
    private int puntaje; // 1 a 5
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

    @Override
    public String toString() {
        return "Calificacion{" + "puntaje=" + puntaje + ", comentario=" + comentario + ", fecha=" + fecha + '}';
    }

    
}