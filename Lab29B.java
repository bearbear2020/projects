// Lab29bst.java
// This is the student version of the Lab29b assignment.


import java.util.ArrayList;


public class Lab29B
{
   public static void main (String args[])
   {
      System.out.println("Lab29b 80/100 Point Version\n");
      MyStack students = new MyStack();
      String student;
   
      System.out.println("Testing the <push> method");
      students.push("Luke Watts");	
      students.push("Brian Sims");
      students.push("Mike Lewis");
      students.push("Jessie Lin");		
      System.out.println();
   	
      MyStack students2 = new MyStack(students);  // remove comments for 100 point version
   	
   			
      System.out.println("Testing the <peek> method");
      student = (String) students.peek();
      System.out.println(student + " is at the top of the stack");
      System.out.println();
   
      System.out.println("Testing the <isEmpty> and <pop> methods");
      while (!students.isEmpty())
      { 	 
         student = (String) students.pop();
         System.out.println("Popping " + student + " from the stack");
      }
   	
   	 // remove comments for 100 point version
      System.out.println("Testing the copy constructor");
      while (!students2.isEmpty())
      { 	 
         student = (String) students2.pop();
         System.out.println("Popping " + student + " from the stack");
      }
      System.out.println();
   	
      
   }		

   static class MyStack<E>
   {
      private ArrayList<E> data;
      private int top;
      public MyStack()
      {
         data = new ArrayList<E>();
         top =-1;
      }
      public MyStack(E students)
      {
         data = new ArrayList<E>();
         data.add(students);
         top=data.size();
      }
      public boolean isEmpty()
      {  
         if( data.size()> 0)
         {
            return top == -1;
         }
         else
            return top==-1;
      }
   
      public void push (E x)
      {
         data.add(x);
         top++;
      }
   
      public E pop()
      {
         int temp = top;
         top--;
         return data.remove(temp);
      }
   
      public E peek()
      {
         return data.get(top);
      }
   
   
   }   

}