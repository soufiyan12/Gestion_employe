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
public class TravailleurHoraire extends Employe {
    private double payHeure;
    private int NbHeure;

    public TravailleurHoraire() {
    }

    public TravailleurHoraire(double payHeure, int NbHeure, String Nom, String Prenom, boolean marie, int nbenfant) {
        super(Nom, Prenom, marie, nbenfant);
        this.payHeure = payHeure;
        this.NbHeure = NbHeure;
    }

    

    public double getPayHeure() {
        return payHeure;
    }

    public void setPayHeure(double payHeure) {
        this.payHeure = payHeure;
    }

    public double getNbHeure() {
        return NbHeure;
    }

    public void setNbHeure(int NbHeure) {
        this.NbHeure = NbHeure;
    }
    
    public double gain(){
        double salary;
        salary=NbHeure*payHeure;
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() +"TravailleurHoraire{" + "payHeure=" + payHeure + ", NbHeure=" + NbHeure + '}';
    }
    
 
}
