// ***********************************************
// Program Identification
// Name: 
// Class: 
// Date: 
// File Location: H:\Java\Labs\Despeckle
// ***********************************************

// ***********************************************
// Program Abstract
// In this assignment you will read in an image with dust spots or speckles on it and remove them.   This problem often occurs with older black and white photos that get scanned into a computer.  You will want to ask the user to specify the size of the speck to remove.  The image you display will remove all specks smaller than the desired value.  Then you will display the image without the specks. Once again, you will use the APImage and Pixel classes to search for speckles.

// ***********************************************

// ***********************************************
// Program Variable Dictionary
//
//
// ***********************************************

import javax.swing.*;
import images.*;
import java.io.*;



public class Despeckle 
{
	public static void main(String args[])
	{
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(null);
		File file = fc.getSelectedFile();
		if (file == null)
			System.exit(0);
		APImage img = new APImage(file.getPath());
    //  APImage img2 = new APImage(file.getPath());

	 // String strNbr1 = JOptionPane.showInputDialog("Enter size of Speck ");
     //String strNbr2 = JOptionPane.showInputDialog("Enter Location ");
		
		
		img.draw();
      

      }

  


}



     /*int tr=0;
     int tg =0;
     int tb = 0;
     int x1 = 0;
     int y1 = 0;
      
     for (int y = 1; y < img.getHeight()-2; y+=3)		
     {
      for (int x = 1; x < img.getWidth()-2; x+=3)
      {
         x1++;
         Pixel p = despeckImage.getPixel(x1,y1);
	      tr=tb=tg=0;
 
        
         for(int i=-1;i<=1;i++)
         {
            for(int j=-1;j<=1;j++)
            {
                 

               Pixel pixel = img.getPixel(x+i, y+j);
               tr = tr + pixel.getRed();
               tg = tg + pixel.getGreen();
               tb = tb + pixel.getBlue();
               
            }
         }
        tb=tb/9;
        tg =tg/9;
        tr=tr/9;
        p.setRed(tr);
        p.setGreen(tg);
        p.setBlue(tb);
      
         
                                                    			
		}
      y++;
    }
    */
	

 
		
	