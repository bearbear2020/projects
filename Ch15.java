
package ch15;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/*

   Programmer: Trent Giever
   Assignment Chapter: 15
   Purpose: learning Java SQL
   Date modified: 1/18/21
   IDE/Tool used: NetBeans 8.2

   */

public class Ch15 
{

   
    public static void main(String[] args) 
    {
      final String DB_URL = "jdbc:derby:CoffeeDB";   
      try
      {
         // Create a connection to the database.
         Connection conn = DriverManager.getConnection(DB_URL);
         
         // Get a Statement object.
         Statement stmt = conn.createStatement();
         
         // Make an SQL statement to create the table.
        /* String sql = "CREATE TABLE Customer" +
            "( CustomerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
            "  Name CHAR(25),"    +
            "  Address CHAR(25)," +
            "  City CHAR(12),"    +
            "  State CHAR(2),"    +
            "  Zip CHAR(5) )";

         // Execute the statement.
         stmt.executeUpdate(sql);*/
         /*String sqlcode = "Select * from Customer "; //sql code"
         ResultSet result = stmt.executeQuery(sqlcode);//exxecute it
         while(result.next())//if found
        {
            out.println("CustomerNumber: " + result.getString("CustomerNumber"));//display custnum 
            out.println("Name: " + result.getString("Name"));//display the name
            out.println("Address: " + result.getString("Address"));//display the address
            out.println("City: " + result.getString("City"));//display the city
            out.println("State: " + result.getString("State"));//display the state
            out.println("Zip: " + result.getString("Zip"));//display the zip
        }*/ //ID nums 101-103
         Scanner in = new Scanner(System.in); //needed for input
         String custNum="",name="",address="",city="",state="",zip="";//variables
         out.print("Enter the customer number: ");
         custNum = in.nextLine();//enter id to look up
         if(find(stmt,custNum))//if found
         {   //new values
             out.print("Enter updated name: ");
             name = in.nextLine();
             out.print("Enter updated address: ");
             address = in.nextLine();
             out.print("Enter updated city: ");
             city = in.nextLine();
             out.print("Enter updated state: ");
             state = in.nextLine();
             out.print("Enter updated zip: ");
             zip = in.nextLine();
             String sqlcode = "UPDATE Customer " + "SET Name = '" + name + "', Address = '" + address +
                     "', City = '" + city + "', State = '" + state + "', Zip = '" + zip + 
                     "' WHERE CustomerNumber = '" + custNum + "'";//update command
             int rows = stmt.executeUpdate(sqlcode);//update
             out.println(rows + " row(s) updated.");//rows effected
             
         }
         else
         {
             out.println("Customer not found");
         }
         // Close the connection.
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
    } 
    public static boolean find(Statement stmt, String custNum) throws SQLException //determine if found
    {
        boolean found = false;//assume not found
        String sqlcode = "Select * from Customer WHERE CustomerNumber = '" + custNum + "'"; //sql code to see if customer
        ResultSet result = stmt.executeQuery(sqlcode);//exxecute it
        if(result.next())//if found
        {
            out.println("Name: " + result.getString("Name"));//display the name
            out.println("Address: " + result.getString("Address"));//display the address
            out.println("City: " + result.getString("City"));//display the city
            out.println("State: " + result.getString("State"));//display the state
            out.println("Zip: " + result.getString("Zip"));//display the zip
            found = true;//found
        }
        return found;//return if found
    }
}
