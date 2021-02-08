// Lab23st.java
// ***********************************************
// Program Identification
// Name: Trent Giever
// Class: Java 6
// Date: 5/4/17
// File Location: H:\Java\Labs\Lab23st
// ***********************************************

// ***********************************************
// Program Abstract
// The purpose of this assignment is to demonstrate knowledge of fundamental Java syntax at the Pre-OOP level.  This is the first program in the second AP Computer Science sequence, also called AP Computer Science AB.  This assignment needs to be performed with minimal preparation to demonstrate to your teacher if you have retained the basic Java syntax knowledge and can create a relatively simple algorithm on short notice.    
 // ***********************************************

// ***********************************************
// Program Variable Dictionary
// number is the number the user enters
// factorNum is a counter variable to determian if the value is a perfect number
// j, i, x is used in the loops
// num is an arraylist that adds the values that are perfect numbers to be outputed in the output loop
// nums is the current index in the output loop of the arraylist
// ***********************************************
import java.util.*;
import java.util.ArrayList;

public class Lab23st
{
   public static void main (String args[]) 
   { 
      Scanner input = new Scanner(System.in);
      int number=0;
      int factorNum =0;
      String output ="";
      //System.out.println("Lab 23 80 Points Version");
      System.out.println("Lab 23 100 Points Version");
      System.out.println();
      
      System.out.print("Enter an integer in [2..10000] range ===>>");
      System.out.println();
      
      number = input.nextInt();
      
      System.out.println("All the perfect numbers betewen 1 and " + number);
      
      ArrayList num = new ArrayList(); 
   // finds if the value is a perfect number
      
      for(int j = 1; j < number;j++)
      {
         for(int x=1; x<j;x++) //100pt
         {
            if(j % x == 0)
            {
               factorNum+=x;
            }
         } 
         if(factorNum==j)
         {
            num.add(factorNum);
         }
         factorNum=0;
      }
      
   // outputs the found value in a organized way, and is simliar to the 80pt version    
      for(int i = 0; i < num.size();i++)
      {
         int nums=(int)(num.get(i));
         for(int x=1; x<nums;x++) //100pt
         {
            if(nums % x == 0)
            {
               if(x>1)
               {
                  System.out.print(" + " );  
               }
               System.out.print(x);
            }
         } 
         System.out.print(" = " + nums);
         System.out.println("");
               
      }
      
           /* for(int x=1; x<number;x++) //80pt
      {
         if(number % x == 0)
         {
            factorNum+=x;
            if(x>1)
            {
               System.out.print(" + " );  
            }
            System.out.print(x);
         }
      } 
      System.out.print(" = " + factorNum);
      System.out.println("");
      if(factorNum==number)
         System.out.println(number + " is a perfect number");
      else
         System.out.println(number + " is not a perfect number");
         */
   }
}      

/* 
    ----jGRASP exec: java Lab23st
 Lab 23 80 Points Version
 
 Enter an integer in [2..10000] range ===>>
 6
 1 + 2 + 3 = 6
 6 is a perfect number
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java Lab23st
 Lab 23 80 Points Version
 
 Enter an integer in [2..10000] range ===>>
 100
 1 + 2 + 4 + 5 + 10 + 20 + 25 + 50 = 117
 100 is not a perfect number
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java Lab23st
 Lab 23 80 Points Version
 
 Enter an integer in [2..10000] range ===>>
 28
 1 + 2 + 4 + 7 + 14 = 28
 28 is a perfect number
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java Lab23st
 Lab 23 80 Points Version
 
 Enter an integer in [2..10000] range ===>>
 496
 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496
 496 is a perfect number
 
  ----jGRASP: operation complete.
    ----jGRASP exec: java Lab23st
 Lab 23 100 Points Version
 
 Enter an integer in [2..10000] range ===>>
 100
 All the perfect numbers betewen 1 and 100
 1 + 2 + 3 = 6
 1 + 2 + 4 + 7 + 14 = 28
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java Lab23st
 Lab 23 100 Points Version
 
 Enter an integer in [2..10000] range ===>>
 10000
 All the perfect numbers betewen 1 and 10000
 1 + 2 + 3 = 6
 1 + 2 + 4 + 7 + 14 = 28
 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496
 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064 = 8128
 
  ----jGRASP: operation complete. 
  
  */