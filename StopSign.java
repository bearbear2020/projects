import java.awt.*;

class StopSign extends TrafficSign
{
	protected Graphics g;
	protected int centerX, centerY;
	protected int radius;
	
	public StopSign(Graphics g1, int r, int x, int y, int height)
	{
		super(g1, x, y, height); 
		g = g1;
		centerX = x;
		centerY = y;
		radius = r;
	}
	
	public void drawShape()
	{
		RegPolygon rp = new RegPolygon(g,radius,centerX,centerY, 8, Color.red, Math.PI/8);
	}
	
	public void drawText()
	{   g.setColor(Color.white);
	g.setFont(new Font("Arial",Font.BOLD,48));
	g.drawString("STOP",centerX -60,centerY+20);  

	}
}

