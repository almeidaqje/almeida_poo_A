package ec.edu.intsuperior.modelo;


public class Libro {
    String titulo;
    String editorial;
    Autor autor;

    public Libro() {
    }

    public Libro(String titulo, String editorial, Autor autor) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }   
}
