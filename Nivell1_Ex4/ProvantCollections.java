package Nivell1_Ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;



public class ProvantCollections {

    
    public static void main(String[] args) {
        
        //Creació d'objectes Persona:
        Persona persona1 = new Persona("Laia", "Facundo", 38);
        Persona persona2 = new Persona("Jordi", "Garcia", 43);
        Persona persona3 = new Persona("Alba", "Martínez",40);
        
        //Creació ArrayList:
        ArrayList<Persona> arrayList = new ArrayList();
        arrayList.add(persona1);
        arrayList.add(persona2);
        arrayList.add(persona3);
        
        //Creació LinkedList:
        LinkedList<Persona> linkedList = new LinkedList();
        linkedList.add(persona1);
        linkedList.add(persona2);
        linkedList.add(persona3);
        
        //Creació HashSet:
        HashSet<Persona> hashSet = new HashSet();
        hashSet.add(persona1);
        hashSet.add(persona2);
        hashSet.add(persona3);
        
        //Creació LinkedHashSet:
        LinkedHashSet<Persona> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(persona1);
        linkedHashSet.add(persona2);
        linkedHashSet.add(persona3);
        
        //Creació TreeSet:
        TreeSet<Persona> treeSet = new TreeSet();
        treeSet.add(persona1);
        treeSet.add(persona2);
        treeSet.add(persona3);
        
        //Aplicant el mètode general iterador:
        System.out.println("\nImprimint ArrayList\n");
        iterCollection(arrayList);
        System.out.println("\nImprimint LinkedList\n");
        iterCollection(linkedList);
        System.out.println("\nImprimint HasSet\n");
        iterCollection(hashSet);
        System.out.println("\nImprimint LinkedHasSet\n");
        iterCollection(linkedHashSet);
        System.out.println("\nImprimint TreeSet\n");
        iterCollection(treeSet);
        
    }
    
    //Mètode genèric.
    public static <T> void iterCollection (Collection <T> c) {
        Iterator <T> it = c.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
               
    }
}
