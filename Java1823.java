// Java1823.java
// This program demonstrates the efficiency of the Insertion Sort.


import java.util.*;


public class Java1823
{
	public static void main(String args[])  
	{
		System.out.println("\nJava1823.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter array size  ===>>  ");
		int size = input.nextInt();
		IntList x = new IntList(size);
		// x.displayList();
		
		//////////
		time.startClock();
		x.insertionSort();
		time.stopClock();
		//////////
		
		// x.displayList();
		System.out.println(time);
		System.out.println();
	}	

}



class IntList
{
	
	private int[] intArray;
	private int size;
	
	public IntList(int s)
	{
		size = s;
		intArray = new int[size];
		Random rand = new Random(1234);
		for (int k = 0; k < size; k++)
		{
			int rndInt = rand.nextInt(9000) + 1000;
			intArray[k] = rndInt;
		}
	}

	public void displayList()
	{
		System.out.println();
		for (int k = 0; k < intArray.length; k++)
			System.out.print(intArray[k] + "    ");
		System.out.println("\n\n");
	}
	
	private int linearSearch(int searchNumber, int numElements)
	{
   		int index = 0;
   		while (index < numElements && searchNumber > intArray[index])
      			index++;
      		return index;
	}

	private void insertItem(int searchNumber, int numElements, int index)
	{
   		for (int k = numElements-1; k > index; k--)
      		intArray[k] = intArray[k-1];
   		intArray[index] = searchNumber;
	}

	public void insertionSort()
	{
   		for (int k = 0; k < size; k++)
   		{
      			int numElements = k + 1;
      			int index = linearSearch(intArray[k],numElements);
      			insertItem(intArray[k],numElements,index);
   		}
	}
}
