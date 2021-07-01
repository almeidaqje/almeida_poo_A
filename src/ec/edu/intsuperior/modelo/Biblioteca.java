package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Biblioteca {
    float tamanio;
    int aforo;
    Libro libro; // tipo de dato abstracto
    String direccion;

    public Biblioteca() {
    }

    public Biblioteca(float tamanio, int aforo, Libro libro, String direccion) {
        this.tamanio = tamanio;
        this.aforo = aforo;
        this.libro = libro;
        this.direccion = direccion;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
