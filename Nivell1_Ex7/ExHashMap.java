
package Nivell1_Ex7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;


public class ExHashMap {

   
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        
        //emplenant HashMap:
        hashMap.put(50, "Madrid");
        hashMap.put(20, "Washington DC");
        hashMap.put(7,"París");
        hashMap.put(4, "Berlín");
        hashMap.put(9,"Pekín");
        
        System.out.println("Ordre Actual del HashMap: "+ hashMap);
        
        
        //Passant les dades del HashMap a un TreeMap:
        TreeMap<Integer, String> ordenat = new TreeMap();
        ordenat.putAll(hashMap);
        System.out.println("Per endreçar les dades s'han passat a un TreeMap: "+ordenat);
        
        //Passant les dades a un LinkedHashMap:
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap(ordenat);
        System.out.println("Es manté l'ordre al passar les dades al "
                + "LinkedHashMap: "+linkedHashMap);
        //Per extreure només les claus:
        ArrayList<Integer> llistaCodis = new ArrayList(linkedHashMap.keySet());
        System.out.println("Llista de codis extrets: "+llistaCodis);
        
        //Es passa la llista de codis ordenats a un HashSet:
        HashSet<Integer> hashSet1  = new HashSet(llistaCodis);
        System.out.println("No queden ordenats al passarlos al HashSet: " + hashSet1);
        
        //Es passa la llista de codis endreçada a un LinkedHashSet:
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet(llistaCodis);
        System.out.println("Al passar les dades al LinkedHahSet si que es"
                + " mantenen endreçades: : "+linkedHashSet);
        
        
    }
    
}
