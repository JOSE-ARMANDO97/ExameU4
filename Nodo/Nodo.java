package Nodo;

public class Nodo {
   public Nodo Rizquierda;
   public  Nodo RDerecha;
   
   public Nodo Wizquierda;
   public  Nodo WDerecha;
     public  int elemento;

    public Nodo(int elemento){
    this.elemento=elemento;
    this.Rizquierda=null;
    this.RDerecha=null;
     this.Wizquierda=null;
    this.WDerecha=null;
}
}
