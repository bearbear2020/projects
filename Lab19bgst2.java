// Lab19bst.java
// The student version of the Lab19b assignment.
// ***********************************************
// Program Identification
// Name: Trent Giever
// Class: Java 6
// Date: 2/21/17
// File Location: H:\Java\Labs\Lab19bst 
// ***********************************************

// ***********************************************
// Program Abstract
// The purpose of this program is to use recursion to draw a set of squares,which become smaller as they reach the other side of the screen.
// ***********************************************

// ***********************************************
// Program Variable Dictionary
// g is the grathics being passed in
 // x is the x value
// y is the y value 
// size is the size of the box's sides
// temp is the temp variable that holds the value of 75% of size rounded 
// sizeTemp is an integer that holds a converted double temp to an integer, than passes it out
// ytemp is the temp vaule for y when the boxes shrink and the y value needs to decrease, and passes out the value
// ***********************************************


import java.awt.*;
import java.awt.event.*;


public class Lab19bgst2
{
   public static void main(String args[])
   {
      Windows win = new Windows();
      win.setSize(1000,750);
      win.addWindowListener(
         new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}});
      win.show();
   }
}
class Square
{
   Graphics g;
   public int x;
   public int y;
   public int size ;
   
   Square(Graphics g2, int x2, int y2,int size2)
   {
      g = g2;
      x = x2;
      y = y2;
      size = size2;
   }
}


class Windows extends Frame
{

   public void paint(Graphics g)
   {
      drawSquare(g, 0, 100, 200);
      
      
   }
    
   public void drawSquare(Graphics g, int x, int y, int size)
   {
     // if(y < 150)
      //{ 
         
      if(size > 2)
      {  
         if( x > -1 && y >-1 && size > 2)
         {
         
            double temp = 0;
            g.fillRect (x,y,size,size);
            temp = Math.round(size*.75);
            int sizeTemp =(int) temp;
           
            drawSquare(g,(x+size+10),y,sizeTemp);
            
            double ytemp =0;
            x = (int)(970-x-sizeTemp);
            ytemp = Math.round(y +(500-(int)temp)); 
            y = (int) ytemp; 
            g.fillRect( x, y,sizeTemp,sizeTemp);
            g.fillRect(980,400,200,200);
            
         }
      
      } 
   }
}
