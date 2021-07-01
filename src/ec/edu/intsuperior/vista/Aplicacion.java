package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Autor;
import ec.edu.intsuperior.modelo.Autor;
import ec.edu.intsuperior.modelo.Biblioteca;
import ec.edu.intsuperior.modelo.Biblioteca;
import ec.edu.intsuperior.modelo.Bicicleta;
import ec.edu.intsuperior.modelo.Bicicleta;
import ec.edu.intsuperior.modelo.Libro;
import ec.edu.intsuperior.modelo.Libro;
import ec.edu.intsuperior.modelo.Punto;
import ec.edu.intsuperior.modelo.Punto;

public class Aplicacion {
    
    public static void main(String[] args) {
        Punto p1=new Punto(-1, 7);
        Punto p2=new Punto();        
        Bicicleta b1=new Bicicleta();
        Bicicleta b2=new Bicicleta(15,"Tundra",225.56,55,"Negro");        
        Autor au1=new Autor("123456789","Angel","Torres","Escritor","80/04/2020");
        Libro l1=new Libro("La Belleza en la Programacion","Int",au1);
        Biblioteca biblio=new Biblioteca(45.0f,55,l1,"Cayambe");
        
        System.out.println("Coordenada x del punto 1 : "+p1.getX());
        System.out.println("Coordenada x del punto 1 : "+p1.getY());
        System.out.println("El autor del libro 1 es: "+l1.getAutor().getNombre());
    }   
}
