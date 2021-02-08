// GfxNode constructor instantiates an object and
	// stores its Top-Left coordinate (tlx,tly) information, as
	// well as the length and width of the node object.  A node object
	// with two fields is drawn at the specified coordinate.
import java.awt.*;
import java.awt.event.*;

class GfxNode
{
Graphics g;
int TLX=0;
int TLY=0;
int CLR =0;
int DT=0;
char cr;
int offset =0;

	public GfxNode(Graphics g1, int tlx, int tly, char ltr, int clr, int dt) 
	{
		g =g1;
		TLX=tlx;
		TLY = tly;
		cr=ltr;
		CLR=clr;
		DT = dt;
	}
	
	// Method getColor a private helper method to make it easier to use colors
	// in a graphics program.	
	private Color getColor(int clr)
	{
		Color temp = Color.white;
		switch (clr)
		{
			case 0:  temp = Color.black;	break;
			case 1:  temp = Color.red; 		break;
			case 2:  temp = Color.green; 	break;
			case 3:  temp = Color.blue; 	break;
			case 4:  temp = Color.orange; 	break;
			case 5:  temp = Color.cyan; 	break;
			case 6:  temp = Color.magenta; 	break;
			case 7:  temp = Color.yellow; 	break;
			case 8:  temp = Color.pink; 	break;
			case 9:  temp = Color.white;	break;
		}
		return temp;
	}



	
	
	// Method getX returns the top-left X-coordinate of a linked list node.
	public int getx()
	{
		return TLX;
		
	}
	
	// Method getY returns the top-left Y-coordinate of a linked list node.
	public int gety()
	{
		return TLY;
		
	}

	// Method drawPointer draws a vertical pointer down to an existing node.
	// The first pointer to a node uses OffSet value 1 and the second
	// pointer to the same node uses OffSet value 2.  The result is that
	// the second pointer is moved farther to the right.
	public void drawPointer(Graphics g, char ltr, int offSet, int clr) 
	{
		getColor(clr);
		offset=offSet;
	
		if(offSet==2)
		{
			String temp = String.valueOf(ltr);
			g.setFont(new Font("Arial",Font.BOLD,15));
			g.drawString(temp, TLX +3, TLY-25);
			g.drawLine(TLX +4, TLY-20, TLX+4, TLY-5);
			g.drawLine(TLX +4,TLY-5,TLX+1,TLY-8);
			g.drawLine(TLX +4,TLY-5,TLX+7,TLY-8);
		}
		
	}

	// Method enterData draws a letter in the Data field of the GfxNode.
	public void enterData(Graphics g, char ltr, int clr) 
	{
		getColor(clr);
		cr=ltr;
		CLR=clr;
	}

	// Method drawLink draws a link from the current sourceNode to the
	// endNode in the specified color (clr).	
	public void drawLink(Graphics g, GfxNode endNode, int clr) 
	{   if(offset !=7)
	{
		getColor(clr);
		g.drawLine(TLX+13, TLY +4, TLX +49, TLY+4);
		g.drawLine(TLX+49,TLY+4,TLX +40,TLY);
		g.drawLine(TLX+49, TLY+4,TLX+40, TLY+8);
	}
		
	}
	
	// Method drawNull draws a diagonal g.drawLine in the Next
	// field of a list node, to indicate a NULL value.
	public void drawNull(Graphics g, int clr)
	{   getColor(clr);
		g.drawLine(TLX+9, TLY,TLX +18,TLY +9);
	}
	
	//  Method drawLetter upper-case Letter characters.  The characters
	//  are drawn in a 9x9 pixel box.
	//  The (x,y) parameters indicate the coordinate of the top-left corner
	//  of the box.  Only capital letters and numbers are drawn.
	public void drawLetter(Graphics g, char ltr, int x, int y) 
	{
		g.drawRect(TLX,TLY,9,9);
		g.drawRect(TLX+9,TLY,9,9);
		g.setFont(new Font("Arial",Font.BOLD,10));
		String temp = String.valueOf(ltr);
		g.drawString(temp,TLX+2,TLY+9); 
	}
	
	

	// Method delay allows viewing the sequence in which the linked lists are drawn/
	void delay(double n)
	{
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();	
	}
	
	}
