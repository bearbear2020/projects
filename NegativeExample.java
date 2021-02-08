import javax.swing.*;
import images.*;
import java.io.*;

public class NegativeExample
{
	public static void main(String args[])
	{
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(null);							//Prompt user to select a file
		File file = fc.getSelectedFile();					//Get the file selected by the user
		if (file == null)
			System.exit(0);									//Close if no file was selected
		APImage img = new APImage(file.getPath());			//Load the image
		APImage neg = new APImage(img.getWidth(), img.getHeight());

		int red;
      int green;
      int blue;
   
      // The following nested loop processing selects a column and goes through 
      // through each row vertically.  If you reverse the order of the loops, it will process
      // each column value before moving to the next row.
		for (int x = 0; x < img.getWidth(); x++)			//Loop through the columns
		{  
			for (int y = 0; y < img.getHeight(); y++)		//Loop down the rows 
			{
				Pixel p = img.getPixel(x, y); 				//Get current pixel
          
				red=255 - p.getRed();					//Invert Red
				green=255 - p.getGreen();				//Invert Green
				blue=255 - p.getBlue();				//Invert Blue
			   neg.setPixel(x, y, new Pixel(red, green, blue));				//Set the negative of the new pixel
			}
		}
		
		img.draw();											//Draw the image
		neg.draw();                               //Draw the negative of the image
	}
}