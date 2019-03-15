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
public class TravailleurCommission extends Employe{
    private double baseSalaire;
    private double ventes;
    private float pourcentage;

    public TravailleurCommission() {
    }

    public TravailleurCommission(double baseSalaire, double ventes, float pourcentage, String Nom, String Prenom, boolean marie, int nbenfant) {
        super(Nom, Prenom, marie, nbenfant);
        this.baseSalaire = baseSalaire;
        this.ventes = ventes;
        this.pourcentage = pourcentage;
    }

    

    public double getBaseSalaire() {
        return baseSalaire;
    }

    public void setBaseSalaire(double baseSalaire) {
        this.baseSalaire = baseSalaire;
    }

    public double getVentes() {
        return ventes;
    }

    public void setVentes(double ventes) {
        this.ventes = ventes;
    }
    
    public double gain(){
        double salary;
        
        salary=baseSalaire+ventes*pourcentage;
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() +"TravailleurCommission{" + "baseSalaire=" + baseSalaire + ", ventes=" + ventes + ", ourcentage=" + pourcentage + '}';
    }
    
}
