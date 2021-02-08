import java.awt.*;

class OldYieldSign extends TrafficSign
{
	protected Graphics g;
	protected int centerX, centerY;
	protected int radius;
	
	public OldYieldSign(Graphics g1, int r, int x, int y, int height)
	{
		super(g1, x, y, height); 
		g = g1;
		centerX = x;
		centerY = y;
		radius = r;
	}
	
	public void drawShape()
	{
	
		RegPolygon rp2 = new RegPolygon(g,radius,centerX,centerY, 3, Color.yellow, Math.PI/6);
	}
	
	public void drawText()
	{   g.setColor(Color.black);
	g.setFont(new Font("Arial",Font.BOLD,40));
	g.drawString("YIELD",centerX -60,centerY+20);  

	}
}