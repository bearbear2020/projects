//import Lab33b.PolyNode;

class PolyNode
{
	
	private int coeff;		// coefficient of each term
	private int degree;		// degree of each term
	private PolyNode next;	// link to the next term node
		
	public PolyNode (int c, int d, PolyNode initNext)
	{
		coeff = c;
		degree = d;
		next = initNext;
	}
	
	public int getCoeff()						
	{ 
		return coeff;			
	}
	
	public int getDegree()
	{
		return degree;
	}
	
	public PolyNode getNext()						
	{ 
		return next;			
	}
	
	public void setCoeff (int newCoeff)		
	{ 
		coeff = newCoeff;  
	}
	
	public void setDegree (int newDegree)
	{
		degree = newDegree;
	}
	
	public void setNext (PolyNode newNext)		
	{ 
		next = newNext; 	
	}
	
}

