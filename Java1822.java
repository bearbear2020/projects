// Java1822.java
// This program tests the efficiency of a nested loop algorithm like the Selection Sort.

import java.util.*;

public class Java1822
{
	public static void main(String args[]) 
	{
		System.out.println("\nJava1822.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter array size  ===>>  ");
		int size = input.nextInt();
		int[] list = new int[size];
		createList(list,size);
		System.out.println();
		// displayList(list);
		
		//////////
		time.startClock();
		selectionSort(list);
		time.stopClock();
		//////////
		
		// displayList(list);
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
	
  	public static void selectionSort(int[] list)
	{
   		int smallest = 0;
   		for (int p = 0; p < list.length; p++)
   		{
      			smallest = p;
      			for (int q = p+1; q < list.length; q++)
	 			if (list[q] < list[smallest])
	    				smallest = q;
      			if (list[p] != list[smallest])
      			{
      				int temp = list[p];
      				list[p] = list[smallest];
      				list[smallest] = temp;
      			}
      		}
	}

}

