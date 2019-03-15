/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author soufiyan
 */
public class ConnexionBD extends Impot {
         ArrayList  aLimites =new ArrayList();
         ArrayList  aCoeffR =new ArrayList();
         ArrayList  aCoeffN =new ArrayList();

    public ConnexionBD() {
        
    }
         
         
      
 public static void main(String[] args)
  {


    try
    {
      // create our mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/employee?zeroDateTimeBehavior=convertToNull";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl,"root", "");
      /*
      String myDriver = "org.apache.derby.jdbc.ClientDriver";
      String myUrl = "jdbc:derby://localhost:1527/sample";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl,"root", "");
      */
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      //String query = "SELECT * FROM employee.emp";

     Statement stmt = conn.createStatement();
       
    /* stmt.executeUpdate("INSERT INTO impot VALUES (24740, 0.15, 2072.5)");
     stmt.executeUpdate("INSERT INTO impot VALUES (31810, 0.2, 3309.5)");
     stmt.executeUpdate("INSERT INTO impot VALUES (39970, 0.25, 4900)");
     stmt.executeUpdate("INSERT INTO impot VALUES (48360, 0.3, 6898.5)");
     stmt.executeUpdate("INSERT INTO impot VALUES (55790, 0.35, 9316.5)");
     stmt.executeUpdate("INSERT INTO impot VALUES (92970, 0.4, 12106)");
     stmt.executeUpdate("INSERT INTO impot VALUES (127860, 0.45, 16754.5)");
     stmt.executeUpdate("INSERT INTO impot VALUES (151250, 0.50, 23147.5)");
     stmt.executeUpdate("INSERT INTO impot VALUES (172040, 0.55, 30710)");
     stmt.executeUpdate("INSERT INTO impot VALUES (195000, 0.6, 39312)");
     stmt.executeUpdate("INSERT INTO impot VALUES (0, 0.65, 49062)");*/



     // création d'un objet Statement
                    Statement S=conn.createStatement();
// requête select
                   String select="select limites, coeffr, coeffn from impots";
// exécution de la requête
                   ResultSet RS=S.executeQuery(select);
            while(RS.next()){
	// exploitation de la ligne courante 
      //construire des vecteurs correspondants au colonne de la table 
	//aLimites.add(RS.getString("limites"));
	//aCoeffR.add(RS.getString("coeffr"));
	//aCoeffN.add(RS.getString("coeffn"));
	}// ligne suivante
	// fermeture ressources
	RS.close();
	S.close();
	conn.close();

    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
}
  

}
