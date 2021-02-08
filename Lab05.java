// ***********************************************
// Program Identification
// Name: Trent Giever
// Class: java 1-2
// Date: 11/09/15
// File Location: \\student\student$\18.Trent.giever\My Documents\Java programs\Lab05.java
// ***********************************************

// ***********************************************
// Program Abstract
// The 80 point version is to draw an arch in the bottom right hand corner
// The 90 point version is to draw an arch in the bottom left hand corner
// The 100 point version is to draw a arch in the top- left and right hand corner
// The purpose of this program is to demonstrate knowledge
// of loop control structures combined with Graphics methods.
// ***********************************************

// ***********************************************
// Program Variable Dictionary
// grathics g is the variable to call the grathics method
// paint is the method used to run the grathics
// java.avt and java.applet runs the grathics programing 
// x is the x cornites in the for loop
// y is the y cordnetes 
// ***********************************************
import java.awt.*;
import java.applet.*;


public class Lab05 extends Applet
{
 
	public void paint(Graphics g)
	{
      int width =980;
      int height = 630;
      g.drawRect(10,10,width,height);
  
      // draw bottom-left courner
  
      int y = 640;
      for (int x = 920; x >= 10; x -= 20)
      {
          g.drawLine(x,640,10,y);
          y-=14;
      }

      // draw bottom right courner
                        
      y = 640;
	   for (int x = 60; x <= 960; x += 20)
	   {
	       g.drawLine(x,640,990,y);
	       y-=14;
      }

      // draw top right corner
   
      y = 10;
	   for (int x = 65; x <= 980; x+= 20)
      {
	       g.drawLine(x,10,990,y);
	       y+=14;
      }
          
      // draw top left corner
   
      y =640;
      for (int x = 25; x <= 905; x+= 20)
	   {
	       g.drawLine(x,10,10,y);
	       y-=14;
      }

      }
}

/*  run output
see attached image
*/ 