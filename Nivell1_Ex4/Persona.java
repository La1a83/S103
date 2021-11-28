
package Nivell1_Ex4;


public class Persona implements Comparable<Persona> {
    //Atributs
    private String nom;
    private String cognom;
    private int edat;
    
    //Constructor:
    public Persona(String nom,String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    @Override
    public String toString() {
        return nom +" " + cognom +", té "+ edat + " anys.";
    }
    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getEdat() {
        return edat;
    }

    
    

    @Override
    public int compareTo(Persona persona) {
        return getNom().compareTo(persona.getNom());
    }

    
    
}
    

    
    
    
    
    
    
    
    
    

