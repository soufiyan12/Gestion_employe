/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author soufiyan
 */
public abstract class Employe{
    
    private String Nom;
    private String Prenom;
    private boolean Marie;
    private int nbEnfants;
    
            
    //initialisaton
    
    
    public Employe(){
        this.Nom=null;
        this.Prenom=null;
        this.Marie=true;
        this.nbEnfants=0;           
    }

    public Employe(String Nom, String Prenom,boolean marie,int nbenfant) {
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.Marie=marie;
        this.nbEnfants=nbenfant;
    }

    public boolean isMarie() {
        return Marie;
    }

    public void setMarie(boolean Marie) {
        this.Marie = Marie;
    }

    public int getNbEnfants() {
        return nbEnfants;
    }

    public void setNbEnfants(int nbEnfants) {
        this.nbEnfants = nbEnfants;
    }
    
    public abstract double gain();

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    @Override
    public String toString() {
        return "Employe{" + "Nom=" + Nom + ", Prenom=" + Prenom + ", Marie=" + Marie + ", nbEnfants=" + nbEnfants + '}';
    }

   
    
    
}
