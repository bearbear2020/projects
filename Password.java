
package project;

import java.util.Random;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Password extends FileManager
{
   
    public Password()
    {   
    }
    public int getLength(String phrase) //returns the phrases length
    {
        return phrase.length(); //returns the strings length
    }
    public String makePassword()//method to make random passowrd
    {
        Random rand = new Random();//uses Random class
        String password = "";//password empty string the char letters are added to
        for(int i =0; i < 35; i++)//35 character password
        {
            int num = rand.nextInt(125 -33 + 1) + 33; //loops through letters, numbers, and special characters index on ASCII table
            char letter = (char) num;//converts the number to a char character
            password +=letter;//adds character to the password    
        }
        
        saveToDataBase(password);//saves the password to the database
        return password;//returns the password
    }
    
    public void copyToClipBoard()//copies the password to clipboard
    {
        String password = getPassword();//gets the password back in
        if(password != "")//as long as it is bot null
        {
        ClipboardContent content = new ClipboardContent();//clipboard obj
        content.putString(password);//add to the clipboard the password
        Clipboard.getSystemClipboard().setContent(content);//adds to the system clipboard
        }
    }
    public void copyToPaper()//radiobutton for paper
    {
        JOptionPane.showMessageDialog(new JFrame(), "Remember to place the piece of paper in a secure place", "Warning", JOptionPane.WARNING_MESSAGE);//hint that unsecure
    }
}
