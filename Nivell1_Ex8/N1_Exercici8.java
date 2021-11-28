
package Nivell1_Ex8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;




public class N1_Exercici8 implements Comparator<Map.Entry<String, Persona>>{

    
    public static void main(String[] args) {
        
        //Creació objecte LinkedHashMap:
        LinkedHashMap<String,Persona> colleccio1 = new LinkedHashMap();
        //Creació d'objectes Persona:
        Persona persona1 = new Persona("Laia","Facundo",38);
        Persona persona2 = new Persona("Jordi","Garcia",43);
        Persona persona3 = new Persona("Laura","Garriga",38);
        Persona persona4 = new Persona("Sandra","González",39);
        //Introducció de les dades al LinkedHashMap:
        colleccio1.put("un", persona1);
        colleccio1.put("dos",persona2);
        colleccio1.put("tres", persona3);
        colleccio1.put("quatre", persona4);
        
        System.out.println("Estat actual de les dades: "+colleccio1);
        
        //Es crea un ArrayList amb les dades del 
        List<Map.Entry<String, Persona> > list = new ArrayList(colleccio1.entrySet());
        System.out.println("Imprimint l'Arraylist abans d'ordenar-lo: "+list);
        Collections.sort(list, new N1_Exercici8());
        System.out.println("Imprimint ArrayList desprès d'endreçar-lo amb Comparator: "+list);
        
        
        /*Tambè es pot endreçar facilment passant les dades a un TreeMap:
        
        TreeMap<String, Persona> sorted = new TreeMap<>(colleccio1);
        System.out.println("Imprimint sorted: "+sorted);*/
    }

    @Override
    public int compare(Map.Entry<String, Persona> o1, Map.Entry<String, Persona> o2) {
        
        return o1.getKey().compareTo(o2.getKey());
        
    }

    
    
}
