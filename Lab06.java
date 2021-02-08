// ***********************************************
// Program Identification
// Name: Trent Giever
// Class: java 1-2
// Date: 12/09/15
// File Location: \\student\student$\18.Trent.giever\My Documents\Java programs\Lab06.java
// ***********************************************

// ***********************************************
// Program Abstract
// The 80 point version is to draw 100 random lines
// The 90 point version is to draw 100 random squares that are 50x50px
// The 100 point version is to draw 100 random size and location circles
// The 110 point version is to draw a box with the pentagon tool
// The purpose of this program is to demonstrate knowledge
// of using constructing objects with the new operator and 
//use object methods.
// ***********************************************

// ***********************************************
// Program Variable Dictionary
// grathics g is the variable to call the grathics method
// paint is the method used to run the grathics
// java.avt and java.applet runs the grathics programing 
// java.util runs random 
// k is the variable in all the loops 
// x1 and x2 are in the random line loop for the x values
// y1 and y2 are in the random line loop for the y values
// red is the color red
// green is the color red
// blue is the color blue
// x is the x value for squares
// y is the y value for squares
// x1 is the x value in circles
// y1 is the y value in circles
// x2y2 is the diameter of the circle   
// ***********************************************
import java.awt.*;
import java.applet.*;
import java.util.*;

public class Lab06 extends Applet
{
 
	public void paint(Graphics g)
	{
     // Draw grid
     g.drawRect (10,10,780,580);
     g.drawLine(400,10,400,590);
     g.drawLine(10,300,790,300);
     
     Random rnd = new Random(1234);
     
     // Draw Random Lines // need to get the lines in correct box
     for (int k = 1; k <= 100; k++)
		{
			int x1 = rnd.nextInt(400)+ 400;  
			int y1 = rnd.nextInt(290) + 10;   
			int x2 = rnd.nextInt(390) + 400;   
			int y2 = rnd.nextInt(291) + 10;
        
         int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			int blue = rnd.nextInt(256);
			g.setColor(new Color(red,green,blue));

			g.drawLine(x1,y1,x2,y2);
		}

     
     // Draw Random Squares
     for (int k = 1; k <= 100; k++)
		{
			int x = rnd.nextInt(350)+8;
			int y = rnd.nextInt(244)+7;
			
         int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			int blue = rnd.nextInt(256);
			g.setColor(new Color(red,green,blue));
			
         g.fillRect(x,y,50,50);
		}

     
     // Draw Random Circles
     for (int k = 1; k <= 100; k++)
		{
			int x1 = rnd.nextInt(220)+ 395;   
			int y1 = rnd.nextInt(100) + 300;   
			int x2y2 = rnd.nextInt(200);   
         
         
         int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			int blue = rnd.nextInt(256);
			g.setColor(new Color(red,green,blue));
			
         g.drawOval(x1,y1,x2y2,x2y2);
		}

     
     // Draw 3-D Box
    
    
    
    
             // green 
               Polygon penta = new Polygon();  
		         penta.addPoint(100,450);
		         penta.addPoint(100,550);
		         penta.addPoint(50,500);
		         penta.addPoint(50,400);
               penta.addPoint(100,450);
		        
               g.setColor(new Color(0,255,0));
		         g.fillPolygon(penta);
      
               // red
               Polygon pentas = new Polygon();
		         pentas.addPoint(100,450);
		         pentas.addPoint(100,550);
		         pentas.addPoint(200,550);
		         pentas.addPoint(200,450);
               pentas.addPoint(100,450);

		         g.setColor(new Color(255,0,0));
		         g.fillPolygon(pentas);

               // yellow
               Polygon pent = new Polygon();  
               pent.addPoint(50,400);
               pent.addPoint(150,400);
		         pent.addPoint(150,450);
		         pent.addPoint(100,450);
               pent.addPoint(50,400);
		         g.setColor(new Color(255,255,0));
		         g.fillPolygon(pent);
               
               // blue
               Polygon pen = new Polygon();
		         pen.addPoint(150,400);
		         pen.addPoint(150,450);
		         pen.addPoint(200,450);
		         pen.addPoint(200,450);
		         g.setColor(new Color(0,0,255));
		         g.fillPolygon(pen);

      }
}

/*  run output
see attached image
*/ 