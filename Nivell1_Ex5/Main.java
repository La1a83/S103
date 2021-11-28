
package Nivell1_Ex5;

import java.util.ArrayList;
import java.util.List;

import java.util.ListIterator;


public class Main {

    
    public static void main(String[] args) {
        
        List<Integer> llista1 = new ArrayList();
        List<Integer> llista2 = new ArrayList();
        
        
        for (int i = 0;i<10;i++) {
            llista1.add(i);
        }
        
        
        for (int i = 0;i<10;i++) {
            llista2.add(i+3);
        }
        System.out.println("Comprovant que s'han creat i emplenat les dues llistes:");
        System.out.println(llista1);
        System.out.println(llista2);
        
        //Creant objectes ListIterator.
        ListIterator<Integer> it = llista1.listIterator();
        ListIterator<Integer>it2 = llista2.listIterator();
        
        
        //Es mou l'iterador a l'última posició de les dues llistes:
        while (it.hasNext()) {
            it.next();
            it2.next();
            
        } 
        //S'afegeixen els números de la llista1 a la llista llista2 en ordre invers:
        while (it.hasPrevious()) {
            it2.add(it.previous());
        }
        
           
        System.out.println("Comprovant que s'han afegit els elements de llista1 "
                + "a llista2 en ordre invers.");
        
        System.out.println("Ara la llista 2 queda així: "+llista2);
        
              
    }
    
    
    
}
