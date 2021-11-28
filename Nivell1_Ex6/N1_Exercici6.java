
package Nivell1_Ex6;

import java.util.LinkedList;
import java.util.ListIterator;
public class N1_Exercici6 {

   
    public static void main(String[] args) {
        
        LinkedList<Integer> llista1 = new LinkedList();
        ListIterator<Integer> it = llista1.listIterator();
        
        //bucle for per introduïr 20 números:
        for (int i=0;i<20;i++) {
            
            if (llista1.size()<2) {
                it.add(i);
                
            } else if (llista1.size()%2 !=0){
                it.add(i);
            } else if (llista1.size()%2==0){
                it.previous();
                it.add(i);
            }
            System.out.println(llista1);
        }
        
        System.out.println("Elements de la llista: "+llista1);
     //Suposo que hi ha una forma mès senzilla de fer això...
       
        
        
    }
    
    
}
