
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import javafx.geometry.Rectangle2D;

class RRCrossingSign extends TrafficSign
{
	protected Graphics g;
	protected int centerX, centerY;
	protected int radius;
	
	public RRCrossingSign(Graphics g1, int r, int x, int y, int height)
	{
		super(g1, x, y, height); 
		g = g1;
		centerX = x;
		centerY = y;
		radius = r;
	}
	
	public void drawShape()
	{   g.setColor(Color.black);
		//g.drawLine(centerX-50, centerY-50, centerX+50, centerY+50);
		//g.drawLine(centerX-40, centerY+40, centerX-50, centerY-50);
		int xCoord[] = {centerX-50,centerX+50,centerX+20,centerX+30};
		int yCoord[] = {centerY-50,centerY+50,centerY+20,centerY+30};
		g.drawPolygon(xCoord,yCoord,4);
		//RegPolygon rp = new RegPolygon(g,50,centerX,centerY, 12, Color.blue, Math.PI/1000);
	}
	
	public void drawText()
	{   g.setColor(Color.black);
	//g.setFont(new Font("Arial",Font.BOLD,48));
	//g.drawString("STOP",centerX -60,centerY+20);  

	}
}

