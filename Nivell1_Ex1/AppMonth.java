
package Nivell1_Ex1;
import java.util.ArrayList;


public class AppMonth {

    static ArrayList <Month> months = new ArrayList<Month>();
    public static void main(String[] args) {
        
        creatingAndAddingMonths();//Metode per crear y afegir els objectes
        //Creant el mes agost:
        Month August = new Month("August");
        //S'agegeix el mes al lloc corresponent:
        months.add(7, August);
        //Comprovant que està ordenat:
        System.out.println(months);
        
        
    }
    
    static void creatingAndAddingMonths() {
       Month January = new Month("January");
       months.add(January);
       Month February = new Month("February");
       months.add(February);
       Month March = new Month("March");
       months.add(March);
       Month April =new Month("April");
       months.add(April);
       Month May = new Month("May");
       months.add(May);
       Month June = new Month("June");
       months.add(June);
       Month July = new Month("July");
       months.add(July);
       Month September = new Month ("September");
       months.add(September);
       Month October = new Month("October");
       months.add(October);
       Month November = new Month("November");
       months.add(November);
       Month December = new Month("December");
       months.add(December);
        
        
    }
    
    
}
