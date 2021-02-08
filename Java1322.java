// Java1322.java
// This program demonstrates a simple mouse draw approach.


import java.applet.Applet;
import java.awt.*;


public class Java1322 extends Applet
{
	
	int[] xCoord,yCoord;
	int pointCount;
	
	public void init()
	{
		xCoord = new int[10000];
		yCoord = new int[10000];
		pointCount = 0;
	}
		
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		for (int k = 0; k < pointCount; k++)
			g.fillRect(xCoord[k],yCoord[k],2,2);
	}		
	
	public boolean mouseDrag(Event e, int x, int y)
	{
		xCoord[pointCount] = x;
		yCoord[pointCount] = y;
		pointCount++;
		repaint();
		return true;
	}

}



	
