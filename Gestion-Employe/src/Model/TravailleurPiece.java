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
public class TravailleurPiece extends Employe {
    private double NbItems;
    private double PrixItem;

    public TravailleurPiece() {
    }

    public TravailleurPiece(double NbItems, double PrixItem, String Nom, String Prenom, boolean marie, int nbenfant) {
        super(Nom, Prenom, marie, nbenfant);
        this.NbItems = NbItems;
        this.PrixItem = PrixItem;
    }

   

    public double getNbItems() {
        return NbItems;
    }

    public void setNbItems(double NbItems) {
        this.NbItems = NbItems;
    }

    public double getPrixItem() {
        return PrixItem;
    }

    public void setPrixItem(double PrixItem) {
        this.PrixItem = PrixItem;
    }
    
    public double gain(){
        double salary;
        salary=NbItems*PrixItem;
        return salary;
    }
    
}
