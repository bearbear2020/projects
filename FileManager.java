
package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager  
{
  
  
     private int counter;//counter if needed
  
    
            
    public FileManager() //default constructor to set values
    {
            counter =0;
    }
     public void saveToDataBase(String password)//saves the password to a file
    {
        try
        {
         
            counter++; 
            PrintWriter write = new PrintWriter("data.dat");
            write.write(password);
            write.close();
        }
        catch(Exception ex)//display error if occurs
        {
            out.println(ex.getMessage());
        }
    }
    public String getPassword()//gets the password back from the table
    {
        String password ="", temp ="";//emply varable to hold the value
         try //gets the password back from the table
         {
             
             File myObj = new File("data.dat");
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
                 password = myReader.nextLine();
                 //temp = myReader.nextLine();
                 //System.out.println(password);
             }    myReader.close();
                 //returns the last password if exists 
         } catch (FileNotFoundException ex) {
             Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
         }
         return password; 
    }
    public int passwordCount()
    {
        return counter;
    }
}
