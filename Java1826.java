// Java1826.java
// This program measures the time necessary to find an element
// in a sorted array with a Binary Search algorithm.

import java.util.*;

public class Java1826
{
	public static void main(String args[])  
	{
		System.out.println("\nJava1826.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter array Size  ===>>  ");
		int size = input.nextInt();
		int[] list = new int[size];
		createList(list,size);
		System.out.println();
		// displayList(list);
		System.out.print("Enter search item  ===>>  ");
		int searchItem = input.nextInt();	
		//////////
		time.startClock();
		int index = binarySearch(list,searchItem);
		time.stopClock();
		//////////
		displayIndex(index);
		System.out.println();
		System.out.println(time);
	}
	
	
	public static void createList (int[] list, int size)
	{
		Random rand = new Random(1234);
		for (int k = 0; k < size; k++)
		{
			int rndInt = rand.nextInt(9000) + 1000;
			list[k] = rndInt;
		}
	}
	
	
	public static void displayList(int[] list)
	{
		for (int k = 0; k < list.length; k++)
			System.out.print(list[k] + "    ");
		System.out.println("\n\n");
	}


	public static int binarySearch( int[] list, int searchItem)
	{
		int lo = 0;
   		int hi = list.length-1;
   		int mid = 0;
   		boolean found = false;
   		while (lo <= hi && !found)
   		{
      			mid = (lo + hi) / 2;
      			if (list[mid] == searchItem)
	 			found = true;
      			else
	 			if (list[mid] > searchItem)
	    				hi = mid - 1;
	 			else
	    				lo = mid + 1;
   		}
   		if (found)
      			return mid;
   		else
      			return -1;
	}

	public static void displayIndex(int index)
	{
   		if (index == -1)
      			System.out.println("The SearchItem is not in the integer list ");
   		else
      			System.out.println("The SearchItem was found at index " + index);
	}	
}
	
