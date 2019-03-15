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
public class Impots {
    
    // les données nécessaires au calcul de l'impôt
// proviennent d'une source extérieure

        protected double[] limites=null;
protected double[] coeffR=null;
protected double[] coeffN=null;
// constructeur vide
protected Impots(){
}
// constructeur
        public Impots(double[] LIMITES, double[] COEFFR, double[] COEFFN) throws Exception{
// on vérifie que les 3 tableaux ont la même taille
                boolean OK=LIMITES.length==COEFFR.length && LIMITES.length==COEFFN.length;
                if (! OK) throw new Exception ("Les 3 tableaux fournis n'ont pas la même taille("+LIMITES.length+","+COEFFR.length+","+COEFFN.length+")");
// c'est bon
                this.limites=LIMITES;
                this.coeffR=COEFFR;
                this.coeffN=COEFFN;
}//constructeur
// calcul de l'impôt
        public long calculer(boolean marié, int nbEnfants, int salaire){
// calcul du nombre de parts
                double nbParts;
                if (marié) nbParts=(double)nbEnfants/2+2;
                else nbParts=(double)nbEnfants/2+1;
                if (nbEnfants>=3) nbParts+=0.5;
// calcul revenu imposable & Quotient familial
                double revenu=0.72*salaire;
                double QF=revenu/nbParts;
// calcul de l'impôt
                limites[limites.length-1]=QF+1;
                int i=0;
                while(QF>limites[i]) i++;
// retour résultat
return (long)(revenu*coeffR[i]-nbParts*coeffN[i]);
}//calculer
}//classe
    

