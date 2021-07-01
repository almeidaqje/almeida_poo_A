package ec.edu.intsuperior.modelo;

public class Punto {
    private int x;
    private int y;
    
    //Constructor 
    public Punto(){
        this.x=0;
        this.x=0;
        System.out.println("Objeto creado");
    }
    public Punto(int x1, int y1){
        this.x=x1;
        this.y=y1;
        System.out.println("Objeto Creado ");
    } 

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }    
}
