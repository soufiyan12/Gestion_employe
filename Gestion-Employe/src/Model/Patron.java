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
public class Patron extends Employe{
    private double PrixHebdo;

    public Patron() {
    }

    public Patron(double PrixHebdo, String Nom, String Prenom, boolean marie, int nbenfant) {
        super(Nom, Prenom, marie, nbenfant);
        this.PrixHebdo = PrixHebdo;
    }

   

    public double getPrixHebdo() {
        return PrixHebdo;
    }

    public void setPrixHebdo(double PrixHebdo) {
        this.PrixHebdo = PrixHebdo;
    }
    
    /**
     *
     * @return
     */
    public double gain(){
     return PrixHebdo;   
    }

    @Override
    public String toString() {
        return super.toString()+ "Patron{" + "PrixHebdo=" + PrixHebdo + '}';
    }
    
}
