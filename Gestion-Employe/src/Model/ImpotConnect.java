/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;

import java.util.*;

/**
 *
 * @author soufiyan
 */
public class ImpotConnect extends Impots{
    
  
public ImpotConnect(String dsnIMPOTS, String userIMPOTS, String mdpIMPOTS)
throws SQLException,ClassNotFoundException{
// dsnIMPOTS : nom DSN de la base de données
// userIMPOTS, mdpIMPOTS : login/mot de passe d'accès à la base
// les tableaux de données
ArrayList aLimites=new ArrayList();
ArrayList aCoeffR=new ArrayList();
ArrayList aCoeffN=new ArrayList();
// connexion à la base
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection connect=DriverManager.getConnection("jdbc:odbc:"+dsnIMPOTS,userIMPOTS,mdpIMPOTS);
// création d'un objet Statement
Statement S=connect.createStatement();
// requête select
String select="select limites, coeffr, coeffn from impots";
// exécution de la requête
ResultSet RS=S.executeQuery(select);
while(RS.next()){
// exploitation de la ligne courante
aLimites.add(RS.getString("limites"));
aCoeffR.add(RS.getString("coeffr"));
aCoeffN.add(RS.getString("coeffn"));
}// ligne suivante
// fermeture ressources
RS.close();
S.close();
connect.close();
// transfert des données dans des tableaux bornés
int n=aLimites.size();
limites=new double[n];
coeffR=new double[n];
coeffN=new double[n];
for(int i=0;i<n;i++){
limites[i]=Double.parseDouble((String)aLimites.get(i));
coeffR[i]=Double.parseDouble((String)aCoeffR.get(i));
coeffN[i]=Double.parseDouble((String)aCoeffN.get(i));
}//for
}//constructeur
}//

