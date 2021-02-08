// Java3013.java
// This program shows the implementation of a dynamic queue class.
// MyQueue4 is also declared as a generic class.  


import java.util.ArrayList;


public class Java3013
{
	public static void main (String args[])
	{
		System.out.println("JAVA3013.JAVA\n");
		MyQueue4<String> students = new MyQueue4<String>();
	
		students.add("Luke Watts");	
		students.add("Brian Sims");
		students.add("Mike Lewis");		
		students.add("Jamie Singbush");
		System.out.println();	
      
		if (students.isEmpty())
			System.out.println("The queue is empty");
		else	  
			System.out.println("Queue front contains " + students.peek());
		System.out.println();
	  
		while (!students.isEmpty())
		{  
			String student = students.remove();
			System.out.println(student);
		}      
		System.out.println();
      
	}		   
}
		 


class MyQueue4<E>
{	
	private ArrayList<E> data;		// stores queue data
	final int front=0;					// keeps index of the queue front
	
	public MyQueue4()
	// Initializes an empty queue object.
	{
		data = new ArrayList<E>();
		//front = 0; 
	}
	
	public boolean isEmpty()
	// Returns true if data is empty, false otherwise
	{
		return data.size() == 0;
	}
	
	public void add(E x)
	// Adds variable x to the back of the queue
	{
		data.add(x);
	}
	
	public E remove()
	// Returns and removes the front element from the queue
	{
		return data.remove(0);
	}
	
	public E peek()
	// Returns the front element from the queue without removal
	{
		return data.get(0);
	}	
}
