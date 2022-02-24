public class Nodo {
    public int dato; 
    public Nodo siguiente; //Puntero de enlace

    //Constructor para Insertar al Final 
    public Nodo(int d){ 
        this.dato=d;
    } 

    //Constructor para Insertar al Inicio 
    public Nodo(int d, Nodo s) { 
        dato=d; 
        siguiente=s; 
    }
}
