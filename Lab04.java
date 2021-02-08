// ***********************************************
// Program Identification
// Name: Trent Giever
// Class: java 1-2
// Date: 10/28/15
// File Location: \\student\student$\18.Trent.giever\My Documents\Java programs\Lab04.java
// ***********************************************

// ***********************************************
// Program Abstract
// The 80 point version is to practice the retangle and line tools to build a retangle box
// The 90 point version is to practice the oval tool and make a globe looking ball
// The 100 point version is a preactice the line tool by making a trangle, and then find the mid point
// The purpose of this program is to demonstrate knowledge of calling methods, using
//correct parameter passing with some of the common methods found in the Graphics class of the java.awt package.
// ***********************************************

// ***********************************************
// Program Variable Dictionary
// grathics g is the variable to call the grathics method
// paint is the method used to run the grathics
// java.avt and java.applet runs the grathics programing 
// ***********************************************
import java.awt.*;
import java.applet.*;


public class Lab04 extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
	   g.drawRect(50,50,300,300);
	   g.drawRect(100,100,300,300);
      g.drawLine(50,50,100,100); 
		g.drawLine(350,350,400,400);
      g.drawLine(50,350,100,400); 
      g.drawLine(350,50,400,100); 
		// DRAW SPHERE
		g.drawOval(550,50,300,300);
	 // g.drawOval();
      g.drawOval(550,125,300,150);
      g.drawOval(550,100,300,200);
      g.drawOval(550,165,300,75);

     // g.drawOval();
      g.drawOval(625,50,150,300);
      g.drawOval(600,50,200,300);
      g.drawOval(665,50,75,300);

		// DRAW TRIANGLE	
      g.drawLine(400,700,1000,700);	
      g.drawLine(400,700,700,400);
      g.drawLine(1000,700,700,400);
      g.drawLine(700,700,700,400);
      g.drawLine(400,700,850,550);
      g.drawLine(1000,700,550,550);
      
      //
      // 110 point version
      //
      
      // DRAW SPHERE
		
      g.drawOval(100,75,300,300);
	
    // g.drawOval();
     
     g.drawOval(100,150,300,150);
      g.drawOval(100,125,300,200);
     g.drawOval(100,190,300,75);

     // g.drawOval();
     
      g.drawOval(170,75,150,300);
      g.drawOval(145,75,200,300);
      g.drawOval(210,75,75,300);
      
	}
}