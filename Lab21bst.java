// Lab21bst.java
// ***********************************************
// Program Identification
// Name: Trent Giever
// Class: Java 6
// Date: 4/18/17
// File Location: H:\Java\Labs\Lab21bst
// ***********************************************

// ***********************************************
// Program Abstract
// The purpose of this program is to review the concepts taught in the past few chapters.  This assignment uses an interface, an abstract class, an ArrayList, and multiple sorts.
// ***********************************************

// ***********************************************
// Program Variable Dictionary
// List list is the list object that is used in the output method
// p is used in the loop method in the sorts
// q is used in the loop method in the sorts
// thisOne is an Integer object and stores the current Arraylist indexes stored value to be compared with nextOne
// nextOne is an Integer object and stores the (current + 1) Arraylist indexes stored value to be compared with thisOne
// smallestValue is an Integer object and stores the smallest value in the pass to place in the correct position. 
// smallest is the smallest value int varriable and starts at pTh index in the Array
// ***********************************************


import java.io.*;
import java.util.Random;
import java.util.ArrayList;


public class Lab21bst
{
   // public static void main(String args[]) throws IOException
   // {
      // BubbleUp list1 = new BubbleUp(20);
      // list1.displayList();
      // list1.sortList();
      // list1.displayList();
   // 
      // BubbleDown list2 = new BubbleDown(15);
      // list2.displayList();
      // list2.sortList();
      // list2.displayList();
   // 	
      // SelectionUp list3 = new SelectionUp(20);
      // list3.displayList();
      // list3.sortList();
      // list3.displayList();
   // 
      // SelectionDown list4 = new SelectionDown(25);
      // list4.displayList();
      // list4.sortList();
      // list4.displayList();
   // }
   
   
   public static void main(String args[]) throws IOException
   {
       BubbleUp list1 = new BubbleUp(20);
      displaySortAndDisplayAgain(list1);
BubbleDown list2 = new BubbleDown(15);
       displaySortAndDisplayAgain(list2);
SelectionUp list3 = new SelectionUp(20);
      displaySortAndDisplayAgain(list3);
SelectionDown list4 = new SelectionDown(25);   	
   displaySortAndDisplayAgain(list4);
   }
   public static void displaySortAndDisplayAgain(List list)throws IOException
   {
      list.displayList();
      list.sortList();
      list.displayList();
   }

}


abstract interface List
{
   public abstract void displayList() throws IOException;
	public abstract void sortList();
}	
	

abstract class List2 implements List
{
   protected ArrayList data = new ArrayList();
   protected int size;
   Random rand = new Random(12345);	
	
public void displayList() throws IOException
   {
      System.out.println("\n"+data);
      pause();
   }	
	
   public void pause() throws IOException
   {   
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));	 
      String dummy;
      System.out.print("\nPress <Enter> to continue  ===>>  ");						
      dummy = input.readLine();								
   }
	
   public void swap(int x, int y)
   {
      Integer a, b;
      a = (Integer) data.get(x);
      b = (Integer) data.get(y);
      data.set(x,b);
      data.set(y,a);
   }	
		
  }


class BubbleUp extends List2
{
   public BubbleUp (int s)
   {
      System.out.println("\n\n\nBubble Up");
      System.out.println("====================");
      size = s;
      for (int j = 0; j < s; j++)
      {
         int temp = rand.nextInt(9000) + 1000;
         data.add(new Integer(temp));
      }
   }
	
   public void sortList()
   {
      int p,q;
      for (p = 1; p < size; p++)
         for (q = 0; q < size - p; q++)
         {
            Integer thisOne = (Integer) data.get(q);
            Integer nextOne = (Integer) data.get(q+1);
            if (thisOne.intValue() > nextOne.intValue())
               swap(q,q+1);
         }
   }
}		   	          		

class BubbleDown extends List2
{
   public BubbleDown (int s)
   {
      System.out.println("\n\n\nBubble Down");
      System.out.println("====================");
      size = s;
      for (int j = 0; j < s; j++)
      {
         int temp = rand.nextInt(9000) + 1000;
         data.add(new Integer(temp));
      }
   }
	
   public void sortList()
   {
      int p,q;
      for (p = 1; p < size; p++)
         for (q = 0; q < size - p; q++)
         {
            Integer thisOne = (Integer) data.get(q);
            Integer nextOne = (Integer) data.get(q+1);
            if (thisOne.intValue() < nextOne.intValue())
               swap(q,q+1);
         }
   }
}		   	          		

class SelectionUp extends List2
{
   public SelectionUp (int s)
   {
      System.out.println("\n\n\nSelection Up");
      System.out.println("====================");
      size = s;
      for (int j = 0; j < s; j++)
      {
         int temp = rand.nextInt(9000) + 1000;
         data.add(new Integer(temp));
      }
   }
	
   public void sortList()
   {
      int smallest = 0;
      for (int p = 0; p <data.size(); p++)
      {
         smallest = p;
         for (int q = p+1; q < data.size(); q++)
         {
            Integer thisOne = (Integer) data.get(q);
            Integer thatOne = (Integer) data.get(p);
            Integer smallestValue = (Integer) data.get(smallest);
         
            if (thisOne.intValue() < smallestValue.intValue())
               smallestValue = q;
            if (thatOne.intValue() != smallestValue.intValue())
            {
               swap(p,smallestValue);
            }
         }
      
      }
   }
}
	

class SelectionDown extends List2
{
   public SelectionDown (int s)
   {
      System.out.println("\n\n\nSelection Down");
      System.out.println("====================");
      size = s;
      for (int j = 0; j < s; j++)
      {
         int temp = rand.nextInt(9000) + 1000;
         data.add(new Integer(temp));
      }
   }
	
   public void sortList()
   {
      int smallest = 0;
      for (int p = 0; p <data.size(); p++)
      {
         smallest = p;
         for (int q = p+1; q < data.size(); q++)
         {
            Integer thisOne = (Integer) data.get(q);
            Integer thatOne = (Integer) data.get(p);
            Integer smallestValue = (Integer) data.get(smallest);
         
            if (thisOne.intValue() > smallestValue.intValue())
               smallestValue = q;
            if (thatOne.intValue() != smallestValue.intValue())
            {
               swap(p,smallestValue);
            }
         }
      
      }
   }
}
/* output
 ----jGRASP exec: java Lab21bst
 
 
 
 Bubble Up
 ====================
 
 [6251, 6080, 9241, 1828, 4055, 2084, 2375, 9802, 2501, 5389, 2517, 1942, 5390, 3806, 3012, 2384, 8787, 5303, 8532, 6175]
 
 Press <Enter> to continue  ===>>  
 
 [1828, 1942, 2084, 2375, 2384, 2501, 2517, 3012, 3806, 4055, 5303, 5389, 5390, 6080, 6175, 6251, 8532, 8787, 9241, 9802]
 
 Press <Enter> to continue  ===>>  
 
 
 
 Bubble Down
 ====================
 
 [6251, 6080, 9241, 1828, 4055, 2084, 2375, 9802, 2501, 5389, 2517, 1942, 5390, 3806, 3012]
 
 Press <Enter> to continue  ===>>  
 
 [9802, 9241, 6251, 6080, 5390, 5389, 4055, 3806, 3012, 2517, 2501, 2375, 2084, 1942, 1828]
 
 Press <Enter> to continue  ===>>  
 
 
 
 Selection Up
 ====================
 
 [6251, 6080, 9241, 1828, 4055, 2084, 2375, 9802, 2501, 5389, 2517, 1942, 5390, 3806, 3012, 2384, 8787, 5303, 8532, 6175]
 
 Press <Enter> to continue  ===>>  
 
 [1828, 1942, 2084, 2375, 2384, 2501, 2517, 3012, 3806, 4055, 5303, 5389, 5390, 6080, 6175, 6251, 8532, 8787, 9241, 9802]
 
 Press <Enter> to continue  ===>>  
 
 
 
 Selection Down
 ====================
 
 [6251, 6080, 9241, 1828, 4055, 2084, 2375, 9802, 2501, 5389, 2517, 1942, 5390, 3806, 3012, 2384, 8787, 5303, 8532, 6175, 3801, 5351, 2792, 7316, 7428]
 
 Press <Enter> to continue  ===>>  
 
 [9802, 9241, 8787, 8532, 7428, 7316, 6251, 6175, 6080, 5390, 5389, 5351, 5303, 4055, 3806, 3801, 3012, 2792, 2517, 2501, 2384, 2375, 2084, 1942, 1828]
 
 Press <Enter> to continue  ===>>  
 
  ----jGRASP: operation complete.
  */