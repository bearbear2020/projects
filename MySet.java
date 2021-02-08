
public class MySet implements MyList
{
int[] list;
int elementCount=0;
	
	public MySet(int x)
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
		boolean found = false;
		for(int j=0; j<list.length;j++)
		{
			if(list[j]==x)
			{
				found = true;
			}
		}
		if(!found)
		{
			list[elementCount]= x;
			elementCount++;
		}
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