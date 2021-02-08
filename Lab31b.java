import java.awt.*;
import java.applet.*;


public class Lab31b extends Applet
{
	
	public void paint(Graphics g)
	{
		StopSign stop1        = new StopSign(g,100,100,100,300);         
		StopSign stop2        = new StopSign(g,100,225,400,300);         
		OldYieldSign yield1   = new OldYieldSign(g,125,350,75,325);     
		OldYieldSign yield2   = new OldYieldSign(g,125,475,475,275);     		
		NoParkingSign noPark1 = new NoParkingSign(g,100,600,100,300);  // 100 & 110 Point Version Only
		NoParkingSign noPark2 = new NoParkingSign(g,100,725,400,300);  // 100 & 110 Point Version Only	
		RRCrossingSign rrx1   = new RRCrossingSign(g,100,850,100,300); // 110 Point Version Only
		RRCrossingSign rrx2   = new RRCrossingSign(g,100,900,550,200); // 110 Point Version Only			
		
		drawTrafficSign(stop1);
		drawTrafficSign(stop2);
		drawTrafficSign(yield1);
		drawTrafficSign(yield2);
		drawTrafficSign(noPark1);   // 100 & 110 Point Version Only
		drawTrafficSign(noPark2);   // 100 & 110 Point Version Only
		drawTrafficSign(rrx1);      // 110 Point Version Only
    	drawTrafficSign(rrx2);		 // 110 Point Version Only 
	}

	private void drawTrafficSign(Sign sign) {
		sign.drawPole();
		sign.drawShape();
		sign.drawText();
		
	}
	
	
}


abstract interface Sign
{
	abstract public void drawShape();

	abstract public void drawPole();
	
	abstract public void drawText();
}

abstract class TrafficSign implements Sign
{
	
	protected int centerX, centerY;
	protected int height;
	protected Graphics g;
	
	public TrafficSign(Graphics g1, int x, int y, int h)
	{
		g = g1;
		centerX = x;
		centerY = y;
		height = h;
	}
	
	public void drawPole()
	{
		g.setColor(Color.black);
		g.fillRect(centerX-7,centerY,15,height);
	}	
	
	abstract public void drawShape();
	
	abstract public void drawText();
}	


class RegPolygon
{	
	public RegPolygon(Graphics g, int radius, int centerX, int centerY, int sides, Color fillColor, double offset)
	{
		double twoPI  = 2 * Math.PI;
		int xCoord[]  = new int[sides];
		int yCoord[]  = new int[sides];

		g.setColor(fillColor);			 
		for (int k = 0; k < sides; k++)
		{
			xCoord[k] = (int) Math.round(Math.cos(twoPI * k/sides - offset) * radius) + centerX;
			yCoord[k] = (int) Math.round(Math.sin(twoPI * k/sides - offset) * radius) + centerY;
		}
		g.fillPolygon(xCoord,yCoord,sides);
	}
}

