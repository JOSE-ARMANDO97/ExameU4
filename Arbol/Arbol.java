package Arbol;

import Nodo.Nodo;


public class Arbol {
     public  Nodo nodoRaiz=null;
   public Nodo nodoPadre=null;
   
     public void Insertar (int nodo1,int nodo2){
        Nodo nodoActual = new Nodo(nodo1);
        Nodo nodoEspejo = new Nodo(nodo2);
        if(nodoPadre ==null){
            nodoPadre= nodoActual;
            nodoRaiz=nodoActual;   
            nodoPadre= nodoEspejo;
            nodoRaiz=nodoEspejo; 
        }else {
            
        if((nodoActual.elemento  <  nodoPadre.elemento)&&(nodoActual.elemento  <  nodoPadre.elemento)){
           if(nodoPadre.Rizquierda==null && nodoPadre.Wizquierda==null){
           nodoPadre.Rizquierda=nodoActual;
           nodoPadre.Wizquierda=nodoEspejo;
           nodoPadre=nodoRaiz;
           }else{
                   nodoPadre = nodoPadre.Rizquierda;
                   Insertar(nodo1,nodo2);
                   
              }    
            
                }else{
                   if(nodoPadre.RDerecha==null&&nodoPadre.WDerecha==null){
                       nodoPadre.RDerecha = nodoActual;
                       nodoPadre.WDerecha = nodoEspejo;
                    nodoPadre=nodoRaiz;
                   }else{
                   nodoPadre = nodoPadre.RDerecha;
                   nodoPadre = nodoPadre.WDerecha;
                   Insertar(nodo1, nodo2);
                   }
              }
        }
        }
      
    
    
  
     
     public void recorridoPost_orden (Nodo reco) {
        if (reco != null) {
            recorridoPost_orden (reco.izquierda); 
            recorridoPost_orden (reco.Derecha);
            System.out.print(" | "+reco.elemento+ " | ");
        } 
    }
   
   
   public void recorridoPre_orden (Nodo reco) {
        if (reco != null) {
            System.out.print("|"+ reco.elemento + "| ");
            recorridoPre_orden (reco.izquierda); 
            recorridoPre_orden (reco.Derecha);
            
        } 
   }
    public void recorridoIn_orden(Nodo reco) {
        if (reco != null) {
            recorridoIn_orden (reco.izquierda); 
            System.out.print("|"+reco.elemento+" | ");
            recorridoIn_orden (reco.Derecha);
        } 
    }
}
