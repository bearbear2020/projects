// Lab24bst.java
// ***********************************************
// Program Identification
// Name: Trent Giever
// Class: Java 6
// Date: 6/8/17
// File Location: H:\Java\Labs\Lab24bst
// ***********************************************

// ***********************************************
// Program Abstract
// Continue to demonstrate an understanding of encapsulation by creating a Circle class with a large number of attributes and methods to manipulate circle movement.
// ***********************************************

// ***********************************************
// Program Variable Dictionary
// Circle shape is an object of the circle class, and is passing data into circle class, then calls up the drawCircle method.
// topLeftX is the left x coordnate corner of the circle
// topLeftY is the top left corner of the y coordante
// incX is the random value for x movement
// incY is the random value for y movement
// diameter is the diameter assigned by the shape construction that makes the size of the circle
// timeDelay is the delay of how long to draw the next circle
// Xcount is used in the 80pt version to draw the row to the right
// Ycountt is used in the 80pt version to draw the row down
// size is the diameter passed in the shape constructor
// xValue is the value of the intial incerment of the program
// yValue is the value of the intial increment of the program
// delay is the value the user enters to have the delay value assigned to
// n is the value passed to delay method that delays the drawing of the next circle
// ***********************************************   

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Lab24bst
{
   public static void main(String args[])
   {
      GfxApp gfx = new GfxApp();
      gfx.setSize(1000,800);
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
   {  /* //80pt version
      g.setColor(Color.blue);
      Circle shape = new Circle(30,100000);
      shape.drawCircle(g);
   	*/
      g.setColor(Color.blue);
      Circle shape = new Circle(30,5,5,100000);
      shape.drawCircle(g);
   }
}
  
     
class Circle
{
   private int topLeftX =0;
   private int topLeftY=0;
   private int incX=0;
   private int incY=0;
   private int diameter=0;
   private int timeDelay=0;
   private int Xcount =1;
   private int Ycount =1; 
   
   public Circle (int size, int delay)//80pt
   {
      diameter=size;
      timeDelay = delay;
      setTLX80();
   }
   
   public Circle (int size, int xValue, int yValue, int delay)//100pt
   {
      diameter=size;
      timeDelay = delay;
      incX = xValue;
      incY = yValue;
   }

   
   private void delay(double n) //both
   {
      for(double k=1;k<n;k+=0.001);
   }
   
   private void setTLX80() //80 pt
   {
      int space =(int)( 900 - (diameter *14));
      space = space /30;
      if(Xcount==14)
      {
         topLeftX=(space*Xcount) + (diameter *Xcount);
         
         setTLY80();
         Xcount=1;
        
      }
      else
      {
         topLeftX = (space*Xcount)+ (diameter *Xcount);
         Xcount++;
      }
   }
   
   private void setTLY80() //80pt
   {
      int space =(int)(700 - (diameter *10));
      space = (int) Math.round(space/22);
   
      topLeftY = (space*Ycount)+ (diameter *Ycount);
      Ycount++;
      if(Ycount > 10)
      {
         Ycount=10;
      }
   }
   private void swap()
   {
      int temp = topLeftX;
      topLeftX= topLeftY;
      topLeftY=temp;
   }

   
   private void newData()//100pt
   {
   
      Random rand = new Random();
      incX=rand.nextInt(8)+5;
      incY=rand.nextInt(8)+5;
   }
   
   private void hitEdge()//100pt
   {
     
      if(topLeftX < 40 || topLeftX + diameter > 880)
      {  
         incX*=-1;
      }
      if(topLeftY < 40 || topLeftY + diameter > 680)
      { 
         incY*=-1; 
      }
      topLeftX+=incX;
      topLeftY+=incY;
   
        
   }
   

   public void drawCircle(Graphics g)
   {  /*//80pt version
      for(int i =1; i <=160; i++)
      {
         setTLX80();
         g.drawOval(topLeftX,topLeftY,diameter,diameter);
         delay(timeDelay);
      }
     */
     //100 pt version
      g.drawRect(10,10,880,680);
      for(int i =1;i<=1000; i++)
      {
         if(i == 1) //starts at middle 
         {
            topLeftX = (900-20)/2;
            topLeftY = (700-20)/2;
            newData();
         }
         else
         {
            g.drawOval(topLeftX,topLeftY,diameter,diameter);
            delay(timeDelay); 
            hitEdge();          
         }
      }
   }
   
}