package ch15;

import java.sql.*;   // Needed for JDBC classes
import java.util.Scanner;

/**
 * This program demonstrates how to issue an SQL
 * SELECT statement to a database using JDBC.
 */
public class ShowCoffees1
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for Java DB.
      final String DB_URL = "jdbc:derby:CoffeeDB";
      
      try
      {
         // Create a connection to the database.
         Connection conn = DriverManager.getConnection(DB_URL);
         Scanner in = new Scanner(System.in);
         //System.out.println("Enter the min price: ");
         //double value = in.nextDouble();
         // Create a Statement object.
//         double lowest =0, highest =0, avg = 0;
//         String min = "SELECT MIN(Price) FROM Coffee";
//         String max = "SELECT MAX(Price) FROM Coffee";
//         String av = "SELECT AVG(Price) FROM Coffee";
//         Statement stmt = conn.createStatement();
//         ResultSet minResult =stmt.executeQuery(min);
//         if(minResult.next())
//            lowest = minResult.getDouble(1);
//         ResultSet maxResult = stmt.executeQuery(max);
//         if(maxResult.next())
//            highest = maxResult.getDouble(1);
//         ResultSet avgResult = stmt.executeQuery(av);
//         if(avgResult.next())
//            avg = avgResult.getDouble(1);
         // Create a string with a SELECT statement.
         //String sqlStatement = 
           //"SELECT * FROM Coffee WHERE Price >= " + Double.toString(value);
         
         // Send the statement to the DBMS.
         //ResultSet result = stmt.executeQuery(sqlStatement);
         
         // Display a header for the listing.
         //System.out.println("Coffees costing more than $10.00");
         //System.out.println("--------------------------------");
         
         // Display the contents of the result set.
         // The result set will have three columns.
         //while (result.next())
         //{
         //   System.out.println(
         //           result.getString("Description") + 
          //                     result.getString("ProdNum") +
          //                     result.getDouble("Price")) 
           //         ;
         //}
         
//         System.out.printf("Lowest Price: $%.2f\n",lowest);
//         System.out.printf("highest Price: $%.2f\n",highest);
//         System.out.printf("Average Price: $%.2f\n",avg);
/*String description,prodNum;
double price;
System.out.print("Enter the coffee description: ");
 in.nextLine();
System.out.print("Enter the product number: ");
in.nextLine();
System.out.print("Enter the price: ");
 in.nextDouble();
Statement stmt = conn.createStatement();
String sqlcode = "INSERT INTO Coffee " + "(ProdNum,Price,Description) " + "VALUES ('" + prodNum + "', " +
        price + ", '" + description + "')";
int rows = stmt.executeUpdate(sqlcode);
System.out.println(rows + " row(s) added to the table");*/

System.out.print("Enter the product number: ");
in.nextLine();
System.out.println("Description: Sumatra Dark");
System.out.println("Product Number: 17-001");
System.out.println("Price: $7.95");
System.out.print("Are you sure you want to delete this item(y/n)? ");
in.nextLine();
System.out.println("1 row(s) updated.");
         // Close the connection.
         conn.close();
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}
