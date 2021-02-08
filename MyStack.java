
 class MyStack implements MyList{
	int[] list;
	int elementCount=0;
	
	public MyStack(int x)
	 {
		list = new int[x];		
	 }

	 public  boolean isEmpty()
	 {  if (list.length > 0)
	 	{
		 	return false;			
	 	}
	 	else 
	 		return true;
	 }			
	 public int remove()
	 {
		 int temp = list[0];
			for (int x = 1; x < list.length-1; x++)
			{
				list[x-1]=list[x];
			}
			elementCount--;
			return temp; 
		
		
	 }
     public void add(int x) 
	{
		if(elementCount < 100)
		{
			
			for(int y =list.length-1; y>0;y--)
			{
		    int temp = list[y-1];
			list[y]=list[y-1];	
			list[y-1]= temp;
			}
			list[0]=x;
			elementCount++;
		}
		
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

