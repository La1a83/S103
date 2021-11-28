
package Nivell1_Ex3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Collections;
import java.lang.Exception;


public class Generadora {
    //Array amb els noms dels personatges de Ghost in the Shell:
    public static String [] personatges = {"Motoko Kusanagi","Batou","Hideo Kuze","Borma",
                                        "Togusa", "Daisuke Aramaki", "Saito", 
                                        "Dr. Ouelet", "Dr. Dahlin"};
    //Un contador per controlar l'index de l'array.
    public  static int contador=0;
    
    
    public static void main(String [] args) {
        
        //Creant i omplint ArrayList:
        ArrayList <String> arrayList = new ArrayList();
        for (String personatge : personatges) {
            arrayList.add(seguentPersonatge());
        }
        
        //Creant i omplint LinkedList:
        LinkedList<String> linkedList = new LinkedList();
        for (String personatge : personatges) {
            linkedList.add(seguentPersonatge());
        }
        
        //Creant i omplint HashSet:
        HashSet<String> hashSet= new HashSet();
        for (String personatge : personatges) {
            hashSet.add(seguentPersonatge());
        }
        
        //Creant i omplint LinkedHashSet:
        LinkedHashSet<String> linkedHashSet= new LinkedHashSet();
        for (String personatge : personatges) {
            linkedHashSet.add(seguentPersonatge());
        }
        
        //Creant i omplint TreeSet:
        TreeSet<String> treeSet= new TreeSet();
        for (String personatge : personatges) {
            treeSet.add(seguentPersonatge());
        }
        
        //Imprimint continguts dels contenidors:
        System.out.println("Contingut ArrayList: "+arrayList);
        System.out.println("Contingut LinkedList: "+linkedList);
        System.out.println("Contingut HasSet: "+hashSet);
        System.out.println("Contingut LinkedHashSet: "+linkedHashSet);
        System.out.println("Contingut TreeSet: "+treeSet);
        
        //Provant d'afegir personatges duplicats als contenidors:
        arrayList.add(seguentPersonatge());
        linkedList.add(seguentPersonatge());
        hashSet.add(seguentPersonatge());
        linkedHashSet.add(seguentPersonatge());
        treeSet.add(seguentPersonatge());
        
      
        
        //Imprimint continguts dels contenidors per comprovar els duplicats::
        System.out.println("\nImprimint els continguts desprès de provar"
                + " d'afegir duplicats:\n");
        System.out.println("Si que hi han duplicats: Contingut ArrayList: "+arrayList);
        System.out.println("Si que hi han duplicats: Contingut LinkedList: "+linkedList);//Si apareixen duplicats
        System.out.println("No permet duplicats: Contingut HashSet: "+hashSet);//no permet duplicats
        System.out.println("No permet duplicats: Contingut LinkedHashSet: "+linkedHashSet);//no permet duplicats.
        System.out.println("No permet duplicats: Contingut TreeSet: "+treeSet);// no permet duplicats.
        
        
        System.out.println("\nProvant les ordenacions:\n");
        
        
        Collections.sort(arrayList);
        System.out.println("Els ArrayList es "
                + "poden ordenar "+arrayList);
        Collections.sort(linkedList); 
        System.out.println("Els LinkedList tambè es poden ordenar: "+linkedList);
        //Collections.sort(hashSet); dona error.
        System.out.println("No es poden ordenar els HashSet: "+hashSet);
        // Collections.sort(linkedHashSet); dona error
        System.out.println("no permet ordenar LinkedHashSet: "+linkedHashSet);
        //Collections.sort(treeSet); error, pero ja s'ordena sola al crearla:
        System.out.println("S'ordena sola al crear-la: "+treeSet);
        
        
    } //Fi del main.  
    //Mètode que retorna un l'String següent de l'array personatges: 
    static String seguentPersonatge() {
            
            String personatge = personatges[contador];
            if (contador<personatges.length-1) {
                contador++;
            } else {
                contador =0;
            }
            return personatge;
    }
    
}
