import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.JOptionPane;
class Circle
{
	private int tlX;		// top-left X coordinate
	private int tlY;		// top-left Y coordinate
	private int incX;		// increment movement of X coordinate
	private int incY;		// increment movement of Y coordinate
	private boolean addX;	// flag to determine add/subtract of increment for X
	private boolean addY;	// flag to determine add/subtract of increment for Y
	private int size;		// diameter of the circle
	private int timeDelay;	// time delay until next circle is drawn
    MyQueue queue = new MyQueue(tlX, tlY);
    private int counter =0;
   Graphics g;


	public Circle(Graphics c, int s, int x, int y, int td)
	{
		incX = x;
		incY = y;
		size = s;
		addX = true;
		addY = false;
		tlX = 400;
		tlY = 300;
		timeDelay = td;
		g=c;
	}
   
	public void delay(int n)
	{
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();	
	}

	public void drawCircle(Graphics g)
	{ 
		g.setColor(Color.blue);
		if (counter ==GfxApp.returnCount())
		{
		eraseCircle();
		counter=GfxApp.returnCount()-1;
		}
		g.drawOval(tlX,tlY,size,size);
		MyQueue.add(tlX, tlY);
		counter++;
		delay(timeDelay);
		if (addX)
			tlX+=incX;
		else
			tlX-=incX;
		if (addY)
			tlY+=incY;
		else
			tlY-=incY;
		
	}
   
   	 
	public void newData()
	{
		incX = (int) Math.round(Math.random() * 7 + 5);
		incY = (int) Math.round(Math.random() * 7 + 5);
	}

	public void hitEdge()
	{
		boolean flag = false;
		if (tlX < incX)
		{
			addX = true;
			flag = true;
		}
		if (tlX > 800 - (30 + incX))  
		{
			addX = false;
			flag = true;
		}
		if (tlY < incY + 30)  // The +30 is due to the fact that the title bar covers the top 30 pixels of the window
		{
			addY = true;
			flag = true;
		}
		if (tlY > 600 - (30 + incY))  
		{
			addY = false;
			flag = true;
		}
		if (flag)
			newData();
	}

	public void eraseCircle()
	{ 
		
		
		//If((MyQueue.returnSize()) >= (GfxApp.returnCount()))
		   g.setColor(Color.white);
		int temp1 = MyQueue.removeX();
		int temp2 = MyQueue.removeY();
			g.drawOval(temp1, temp2, GfxApp.returnSize(), GfxApp.returnSize());
			
			//GfxApp.Coord.remove();
			//MyQueue.removeY();
		//}
		g.setColor(Color.blue);
		//MyQueue.add(getTLX(), getTLY());
	}
	

	

	private void If(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public int getTLX()
	{
		return tlX;
		
	}
	
	public int getTLY()
	{
		return tlY;
		
	}	
	
}

