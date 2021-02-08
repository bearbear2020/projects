// Lab26ast
// This is the student version of the Lab26a assignment.
// The <main> method for both 80-point and 100-point version are provided.

import java.util.ArrayList;


public class Lab26
{
	
	/*public static void main(String args[])
	{
		System.out.println("\nLAB26A 80-POINT VERSION\n");
		
		Matrix m1 = new Matrix();
		m1.displayMatrix("Matrix m1 Default Display");
		System.out.println();
		
		Matrix m2 = new Matrix(3,5);
		m2.displayMatrix("Matrix m2 3 X 5 Display");
		System.out.println();
		int count = 100;
		for (int r = 0; r < m2.getRows(); r++)
		{
			for (int c = 0; c < m2.getCols(); c++)
			{
				m2.setValue(r,c,count);
				count++;
			}
		}		
		m2.displayMatrix("Matrix m2 3 X 5 Consecutive Integers Display");
		System.out.println();
		
		Matrix m3 = new Matrix(3,3,100);				
		m3.displayMatrix("Matrix m3 3 X 3 Initialized to 100 Display");
		System.out.println();
	}	*/
	
	public static void main(String args[])
	{
		System.out.println("\nLAB24A 100-POINT VERSION\n");
		
		Matrix m1 = new Matrix();
		m1.displayMatrix("Matrix m1 Default Display");
		System.out.println();
		
		Matrix m2 = new Matrix(3,5);
		int count = 100;
		for (int r = 0; r < m2.getRows(); r++)
		{
			for (int c = 0; c < m2.getCols(); c++)
			{
				m2.setValue(r,c,count);
				count++;
			}
		}		
		m2.displayMatrix("Matrix m2 3 X 5 Consecutive Integers Display");
		System.out.println();
		
		m2.resize(4,4);
		m2.displayMatrix("Matrix m2 After 4 X 4 Resizing Display");
		System.out.println();
		
		Matrix m3 = new Matrix(3,3,100);				
		m3.displayMatrix("Matrix m3 3 X 3 Initialized to 100 Display");
		System.out.println();
	}

	
}

 class Matrix 
{

/**  Constructs empty ArrayList object and sets all values to 0  **/
public Matrix()
{
	ArrayList<Integer>list = new ArrayList<Integer>(20);
	listSize = 20;
	for(int lists: list)
	    list.add(0);
	  
}

/**  Constructs r X c matrix with all elements initialized to 0  **/
public Matrix(int r, int c)
{
	numRows = r;
    numCols=c;
	int temp = r*c;
	ArrayList<Integer>list = new ArrayList<Integer>(temp);
	listSize=r*c;
	for(int lists: list);
	    list.add(0);
}

/** Constructs r X c matrix will all elements initialized to value  **/
public Matrix(int r, int c, int value)
{   numRows = r;
    numCols=c;
	listSize=r*c;
	ArrayList<Integer>list = new ArrayList<Integer>(listSize);
	for(int lists: list);
	    list.add(value);
}

/**  Returns numRows value  **/
public int getRows()
{
	return numRows;
	
}

/**  Returns numCols value  **/
public int getCols()
{
return numCols;	
}

/**  Returns listSize value  **/
public int getSize()
{
	return list.size();
}

/**  Returns Matrix object value at (r,c) location  **/	     
public int getValue(int r, int c)
{
	/*int temp = 0;
	
	if (r>1)
	{
		for(int z = r; r > 1; z--)
		{
			temp += c;
		}
		temp += c;
	}
	if (r <= 1) 
	{
		temp += r;
		temp +=c;
	}*/
	int temp= ((r-1)*c)+c;
	return (int) list.get(temp);
}

/**  Alters Matrix object value at (r,c) to value  **/
public void setValue(int r, int c, int value)
{
	/*for(int m =1; m<r;m++)
	{
		for(int j = 1; j<c;j++)
		{
			int temp = 0;
			if(m>1)
			{
				temp = m*c;
				temp +=c;
			}
			if(m==1)
			{
				temp = m+j;
			}*/
	
	int temp = ((r-1)*c) + c;
			list.set(temp, value);
		//}
	//}
}

/**  Displays Matrix object in two-dimensional matrix format  **/
public void displayMatrix(String str)
{ 
	System.out.println(str);
	/*int count = 0; 
	//int j =0;
	//if( j = 0; j < list.size(); j++)
//{
//if(numCols > 1) 
//{
		//if(numRows > 1)
		//{
			 //count = 0; 
			for(int r =0; r < numRows-1;r++)
			{
				System.out.println("");
				//System.out.println(count);
				for(int c=0;c<numCols-1;c++)
				{
					//System.out.println(count);
					//if(count < (listSize-1))
					//{
				System.out.print(list.get(((r-1)*numCols)+numCols)+ " ");
				count++;
					//}
				}	
			}
		//}
//}
//} */
	if( numCols ==0)
	{
		System.out.println("Matrix has no elements");
	} 

	int temp = 1;
	int count=0;
	if(list.size() >0)
	{
    for(int x = 0; x < list.size()-1; x++){
      
        //  if(temp < numCols-1)
          //{
             System.out.print(list.get(x)+ " ");
            
            // count++;
         // }
         // else
         // {
          //   System.out.print(list.get(x) + " ");
          //   temp++;
          //   count++;
        //  }
       
    }
	}
}
	


							
/**  Resizes Matrix object to new rows X cols size, copies all possible
      previous values and initializes new elements to zero  **/
public void resize(int rows, int cols)
{
	
}
							
private ArrayList list;		// one-dimensional array stores matrix values
private int listSize;			// total number of elements in the matrix
private int numRows;		// number of rows in the matrix
private int numCols;		// number of cols in the matrix

}




