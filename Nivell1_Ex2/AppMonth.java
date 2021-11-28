
package Nivell1_Ex2;

import java.util.HashSet;




public class AppMonth {

    static HashSet <Month> months = new HashSet();
    public static void main(String[] args) {
        
        creatingAndAddingMonths();//Metode per crear y afegir els objectes
        
        System.out.println(months);//Els mersos duplicats no apareixen.
        
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
       Month August = new Month("August");
       months.add(August);
       Month September = new Month ("September");
       months.add(September);
       Month October = new Month("October");
       months.add(October);
       Month November = new Month("November");
       months.add(November);
       Month December = new Month("December");
       months.add(December);
       //Afegim mesos repetits:
       months.add(January);
       months.add(February);
       months.add(March);
        
        
    }
    
    
}
