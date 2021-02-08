// Lab21aGst.java
// ***********************************************
// Program Identification
// Name: Trent Giever
// Class: Java 6
// Date: 4/14/17
// File Location: H:\Java\Labs\Lab19bst
// ***********************************************

// ***********************************************
// Program Abstract
// The purpose of this program is to become comfortable with interfaces and abstract classes.  
// ***********************************************

// ***********************************************
// Program Variable Dictionary
// xCoord is the array containing x coordinates
// yCoord is the array containing y coordinates
// centerX is the center point of the octigon
// centerY is the center point for the octigon
// shape is the shape in the output method 
// radius is the radius desired for the octigon
// numSides is the number of sides the shape has
// shapeName is the name of the shape
// messageX is the x-coordinate for the shape infomation
// messageY is the y-coordinate for the shape infomation
// ***********************************************

import java.util.Random;
import java.awt.*;
import java.awt.event.*;


public class Lab21aGst
{
   public static void main(String args[])
   {
      Windows win = new Windows();
      win.setSize(800,600);
      win.addWindowListener(
         new WindowAdapter() {
            public void
            windowClosing(WindowEvent e) {System.exit(0);}});
      win.show();
   }
}


class Windows extends Frame
{
	
//    public void paint(Graphics g)
//    {
//       drawGrid(g);
//    
//       Square shape1 = new Square(g);
//       shape1.drawShape(g);
//       shape1.displayNumSides(g);
//    
//       Triangle shape2 = new Triangle(g);
//       shape2.drawShape(g);
//       shape2.displayNumSides(g);
//    
//       Octagon shape3 = new Octagon(g);
//       shape3.drawShape(g);
//       shape3.displayNumSides(g);
//    
//       Circle shape4 = new Circle(g);
//       shape4.drawShape(g);
//       shape4.displayNumSides(g);
//    }


   public void paint(Graphics g)
   {
      drawGrid(g);
   
      Square   shape1 = new Square(g);
      Triangle shape2 = new Triangle(g);
      Octagon  shape3 = new Octagon(g);
      Circle   shape4 = new Circle(g);
   	
      output(g,shape1);
      output(g,shape2);
      output(g,shape3);
      output(g,shape4);
   }

   public void drawGrid(Graphics g)
   {
      g.drawLine(0,300,800,300);
      g.drawLine(400,0,400,600);
      g.drawString("Square",420,50);
      g.drawString("Triangle",20,50);
      g.drawString("Octagon",420,320);
      g.drawString("Circle",20,320);
   }
   public void output(Graphics g,Shape shape)
   {
   shape.drawShape(g);
       shape.displayNumSides(g);

   }
	
}
		


abstract interface Shape
{
   public final double PI = Math.PI;	
   public abstract void drawShape(Graphics g);
   public abstract void displayNumSides(Graphics g);
}

abstract class Shape2 implements Shape //fix

{
   public abstract void displayNumSides(Graphics g); 
   public abstract void drawShape(Graphics g);
}


class Square extends Shape2
{
   private int numSides;
   private String shapeName;
   private Graphics g;
   private int messageX, messageY;
   public Square(Graphics g1)
   {
      numSides = 4;
      shapeName = "Square";
      g = g1;
      messageX = 450;
      messageY = 275;
   }
  	
   public void drawShape(Graphics g)
   {
      g.fillRect(500,50,150,150);
   }
    
   public void displayNumSides(Graphics g)
   {
      g.drawString("A " + shapeName + " has " + numSides + " sides.",messageX,messageY);
   }	
}
    
    
class Triangle extends Shape2
{
   private int numSides;
   private String shapeName;
   private Graphics g;
   private int messageX, messageY;
   public Triangle(Graphics g1)
   {
      numSides = 3;
      shapeName = "Triangle";
      g = g1;
      messageX = 50;
      messageY = 275;
   }
   public void drawShape(Graphics g)
   {
      int xCoord[] = {50,150,250};
      int yCoord[] = {200,50, 200 };
      g.fillPolygon(xCoord,yCoord,3);
   }
    
   public void displayNumSides(Graphics g)
   {
      g.drawString("A " + shapeName + " has " + numSides + " sides.",messageX,messageY);
   }			
}

class Octagon extends Shape2
{
   private int numSides;
   private String shapeName;
   private Graphics g;
   private int messageX, messageY;
   public Octagon(Graphics g1)
   {
      numSides = 8;
      shapeName = "Octagon";
      g = g1;
      messageX = 450;
      messageY = 575;
   }
   public void drawShape(Graphics g)
   {
      int centerX = 550;
      int centerY = 425;
      int radius = 100;
      double twoPI = 2 * PI;
      int xCoord[] = new int[8];
      int yCoord[] = new int[8];
   	
      for (int k = 0; k < 8; k++)
      {
         xCoord[k] = (int) Math.round(Math.cos(twoPI * k/8) * radius) + centerX;
         yCoord[k] = (int) Math.round(Math.sin(twoPI * k/8) * radius) + centerY;
      }
      g.fillPolygon(xCoord,yCoord,8);
   }
    
   public void displayNumSides(Graphics g)
   {
      g.drawString("A " + shapeName + " has " + numSides + " sides.",messageX,messageY);
   }			
}

class Circle extends Shape2
{
   private int numSides;
   private String shapeName;
   private Graphics g;
   private int messageX, messageY;
   public Circle(Graphics g1)
   {
      numSides = 0;
      shapeName = "Circle";
      g = g1;
      messageX = 50;
      messageY = 575;
   }
   
   public void drawShape(Graphics g)
   {
      g.fillOval(100,350,150,150);
   }    
   public void displayNumSides(Graphics g)
   {
      g.drawString("A " + shapeName + " has " + numSides + " sides.",messageX,messageY);
   }			

}  