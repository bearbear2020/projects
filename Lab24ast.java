// Lab24ast.java
// ***********************************************
// Program Identification
// Name: Trent Giever
// Class: Java 6
// Date: 5/26/17 
// File Location:  H:\Java\Labs\Lab24st
// ***********************************************

// ***********************************************
// Program Abstract
// Create a polygon class, which encapsulates all the necessary attributes and actions to draw regular polygons of a requested number of sides.  The essence of this assignment is to demonstrate the ability to create a practical class. 
// ***********************************************

// ***********************************************
// Program Variable Dictionary
// shape1-6, and shape is used to draw the 100pt version
// shape is used to draw the 80pt version
// radius is the class variable that holds the radius value
// centerX is the class variable that holds the x cordnate of center
// centerY is the class variable that holds the y coordnate of center
// numOfPoints is the class variable that holds the number of sides 
// centerXvalue is the center x value the user enters into the class
// centerYvalue is the center y value the user enter into the class
// radius is the radis value the user enters into the class
// points is the number of sides the user enters
// xCoord hold the sides coordnates to be outputed
// yCoord holds the sides coordnates to be outputed
// ***********************************************


import java.awt.*;
import java.awt.event.*;


public class Lab24ast
{
   public static void main(String args[])
   {
      GfxApp gfx = new GfxApp();
      gfx.setSize(900,700);
      gfx.addWindowListener(
         new WindowAdapter() {
            public void
            windowClosing(WindowEvent e) {System.exit(0);}});
      gfx.show();
   }
}


class GfxApp extends Frame
{
   public void paint(Graphics g) 
   {     
      g.setColor(Color.blue);
      //RegPoly shape= new RegPoly(400,300,150,8); //80pt
      //shape.drawPoly(g);//80pt
    
    RegPoly shape1 = new RegPoly(100,100,60,3);
     RegPoly shape2 = new RegPoly(200,200,60,4);
   RegPoly shape3 = new RegPoly(300,300,60,5);
   RegPoly shape4 = new RegPoly(400,400,60,6);
    RegPoly shape5 = new RegPoly(500,500,60,7);
   RegPoly shape6 = new RegPoly(600,600,60,8);

    
    drawShape(shape1, g);
    drawShape(shape2,g);
    drawShape(shape3,g);
    drawShape(shape4, g);
    drawShape(shape5,g);
    drawShape(shape6,g);
   }
   public void drawShape(RegPoly shape,Graphics g)
   {
   shape.drawPoly(g);
   }
}

   
   
class RegPoly
{
   private int radius;
   private int centerX;
   private int centerY;
   private int numOfPoints;
  
   public RegPoly( int centerXValue, int centerYValue, int radius, int points)
   {
      centerX=centerXValue;
      centerY= centerYValue;
      this.radius=radius;
      numOfPoints=points;
   }
   public void drawPoly(Graphics g)
   {
      double twoPI = 2 * Math.PI;
      int xCoord[]=new int[numOfPoints];
      int yCoord[]=new int[numOfPoints];
   
      for (int k = 0; k < numOfPoints; k++)
      {
         xCoord[k] = (int) Math.round(Math.cos(twoPI * k / numOfPoints) * radius) + centerX;
         yCoord[k] = (int) Math.round(Math.sin(twoPI * k / numOfPoints) * radius) + centerY;
      }
      g.fillPolygon(xCoord,yCoord,numOfPoints);
      
      
      
   
   }	
  
}