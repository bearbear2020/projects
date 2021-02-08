// Java1821.java
// This program tests the efficiency of a nested loop algorithm
// like the Bubble Sort.


import java.util.*;


public class Java1821
{
	public static void main(String args[]) 
	{
		System.out.println("\nJava1821.java\n");
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
		bubbleSort(list);
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
	

  	public static void bubbleSort(int[] list)
	{
   		for (int p = 1; p < list.length; p++)
      			for ( int q = 0;  q < list.length-p; q++)
				if (list[q] > list[q+1])
				{
					int temp = list[q];
					list[q] = list[q+1];
					list[q+1] = temp;
					
				}
	}	

}
