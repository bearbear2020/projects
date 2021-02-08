

public class MyOrdList implements MyList
{
int[] list;
int elementCount=0;
	
	public MyOrdList(int x)
	{
		list = new int[x];
	}

	public boolean isEmpty()
	{
		if (list.length > 0)
	 	{
		 	return false;			
	 	}
	 	else 
	 		return true;
	}

	public void add(int x)
	{   
		if(elementCount < 100)
		{
			list[elementCount]= x;
			elementCount++;
			bubbleSort();	 
		}
			
		}

	
	public  int remove()
	{
		int temp = list[0];
		for (int x = 1; x < list.length-1; x++)
		{
			list[x-1]=list[x];
		}
		elementCount--;
		return temp; 
	}
	
	public int getSize()
	{
		return list.length;

	}
	public void bubbleSort(){
		   
	      int size = elementCount;
	   
	      boolean sorted;
	      int p = 1;
	      do
	      {
	         sorted = true;
	         for (int q = 0; q < size-p; q++)
	            if (list[q] > list[q+1])
	            {			
	               int temp = list[q];
	              list[q] = list[q+1];
	               list[q+1] = temp;
	               
	               sorted = false;
	            }
	         p++;
	      }
	      while (!sorted);
	    
	      } 

	public String toString()
	   {
		 String output = "";
	     for(int i =0; i<elementCount; i++)
	     {   
	    	 output+=list[i] + ",";
	     }
	     	return( "[" + output + "]"); 
	  }

}