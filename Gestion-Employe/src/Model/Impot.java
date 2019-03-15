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
public class Impot{

    private double impot;
    private double nbParts;
    private double revenu;
    private double coefficient_familial;
    private double[] limites, coeffR, coeffN;
    /*
    · on calcule le nombre de parts du salarié 
nbParts=nbEnfants/2 +1  s'il n'est pas marié, 
nbEnfants/2+2 s'il est marié, 
où nbEnfants est son nombre d'enfants.
· s'il a au moins trois enfants, il a une demi-part de plus
· on calcule son revenu imposable R=0.72*S où S est son salaire annuel
· on calcule son coefficient familial QF=R/nbParts

Pour calculer l'impôt I, on recherche la première ligne où QF<=champ1. 
    Par exemple, si QF=23000 on trouvera la ligne 24740 0.15 2072.5.
    L'impôt I est alors égal à 0.15*R - 2072.5*nbParts. 
    Si QF est tel que la relation QF<=champ1 n'est jamais vérifiée, 
    alors ce sont les coefficients de la dernière ligne qui sont utilisés, 
    ce qui donne l'impôt I=0.65*R - 49062*nbParts.

    */
    /*
 
      Employe em;
    public double calculImpot(double limites , double coeffr,double coeffn){
         
        if(em.getNbEnfants()>=3){
        if(em.isMarie()==false){
            nbParts=(em.getNbEnfants()/2 +1);
            nbParts+=(nbParts/2);
        }else{
            nbParts=em.getNbEnfants()/2+2;
            nbParts+=nbParts/2;
        }
        }else{
            if(em.isMarie()==false){
            nbParts=em.getNbEnfants()/2 +1;
        }else{
            nbParts=em.getNbEnfants()/2+2;
        }
            revenu=0.72*em.gain();
            
            coefficient_familial=revenu/nbParts;
            
            impot=coeffr*revenu - coeffn*nbParts;
        
        
        return impot;
    }*/
}
