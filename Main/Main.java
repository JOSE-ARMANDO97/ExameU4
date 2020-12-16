package Main;

import Arbol.Arbol;
import Nodo.Nodo;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception{
    Scanner leer = new Scanner(System.in);
        Arbol obj = new Arbol ();
       boolean continuar = true;
              Object Procesos;
       int  menu=0; 
              
    
        while(continuar){
    
        System.out.println("\n BIENVENIDOS AL MENU DE LISTAS ENLAZADAS \n"
                   + "1: INSERTAR NODOS AL  ARBOL\n"
                   + "2: RECORRIDO EN INORDEN \n"
                   + "3: RECORRIDO EN PREORDEN \n"
                   + "4: RECORRIDO EN POSORDEN "+"\n"
                   + "5: SALIR  "+"\n");
        menu=leer.nextInt();
        
          switch(menu){
              case 1:  
              
         
                System.out.println("INGRESA NODOS");
            int num =leer.nextInt();
          obj.Insertar(num,num);
            
                break;
            case 2: 
                Nodo raiz;
                obj.recorridoIn_orden(obj.nodoRaiz);
               break;
            case 3:
                 obj.recorridoPre_orden(obj.nodoRaiz);
                
                break;
            case 4:
                obj.recorridoPost_orden(obj.nodoRaiz);
                break;
            case 5:
               System.out.println("fuera");
                    continuar =false;
                break;
                 default:
                 System.out.println("");
                 break;
           
          }
     }
  }
    
}
