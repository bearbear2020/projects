package project;

import java.sql.*;   // Needed for JDBC classes

/**
 * This program creates the CoffeeDB database.
 */
public class CreatePasswordListDB
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for Java DB.
      final String DB_URL = "jdbc:derby:PasswordListDB;create=false";
      
      try
      {
         // Create a connection to the database.
         Connection conn =
                DriverManager.getConnection(DB_URL);
					 
			// If the DB already exists, drop the tables.
			dropTables(conn);
			
			// Build the Coffee table.
			buildPasswordTable(conn);
			
			// Build the Customer table.
			//buildCustomerTable(conn);
			
			// Build the UnpaidInvoice table.
			//buildUnpaidOrderTable(conn);

         // Close the connection.
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
	
	public static void dropTables(Connection conn)
	{
		System.out.println("Checking for existing tables.");
		
		try
		{
			// Get a Statement object.
			Statement stmt  = conn.createStatement();;

			try
			{
	         // Drop the Passwords table.
	         stmt.execute("DROP TABLE Passwords");
				System.out.println("Passwords table dropped.");
			}
			catch(SQLException ex)
			{
				// No need to report an error.
				// The table simply did not exist.
			}

			try
			{
	         // Drop the Phrases table.
	         stmt.execute("DROP TABLE Phrases");
				System.out.println("Phrases table dropped.");				
			}
			catch(SQLException ex)
			{
				// No need to report an error.
				// The table simply did not exist.
			}

			
		}
  		catch(SQLException ex)
		{
	      System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
	public static void buildPasswordTable(Connection conn)
	{
		try
		{
         // Get a Statement object.
         Statement stmt = conn.createStatement();
         
			// Create the table.
						 
			stmt.execute("CREATE TABLE PassowrdList (" + "number INTEGER NOT NULL PRIMARY KEY, " + "password CHAR(36) NOT NULL" + ")");
							 
			System.out.println("Password table created.");
		}
		catch (SQLException ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
	}

	/**
	 * The buildCustomerTable method creates the
	 * Customer table and adds some rows to it.
	 */
	public static void buildCustomerTable(Connection conn)
	{
      try
      {
         // Get a Statement object.
         Statement stmt = conn.createStatement();
         
         // Create the table.
         stmt.execute("CREATE TABLE Customer" +
            "( CustomerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
            "  Name CHAR(25),"    +
            "  Address CHAR(25)," +
            "  City CHAR(12),"    +
            "  State CHAR(2),"    +
            "  Zip CHAR(5) )");

         // Add some rows to the new table.
         stmt.executeUpdate("INSERT INTO Customer VALUES" +
               "('101', 'Downtown Cafe', '17 N. Main Street'," +
               " 'Asheville', 'NC', '55515')");
         
         stmt.executeUpdate("INSERT INTO Customer VALUES" +
               "('102', 'Main Street Grocery'," +
					" '110 E. Main Street'," +
               " 'Canton', 'NC', '55555')");

         stmt.executeUpdate("INSERT INTO Customer VALUES" +
               "('103', 'The Coffee Place', '101 Center Plaza'," +
               " 'Waynesville', 'NC', '55516')");
					
			System.out.println("Customer table created.");
		}
		catch (SQLException ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
	}

}