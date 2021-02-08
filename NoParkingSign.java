import java.awt.*;

class NoParkingSign extends TrafficSign
{
	protected Graphics g;
	protected int centerX, centerY;
	protected int radius;
	
	public NoParkingSign(Graphics g1, int r, int x, int y, int height)
	{
		super(g1, x, y, height); 
		g = g1;
		centerX = x;
		centerY = y;
		radius = r;
	}
	
	public void drawShape()
	{
		g.setColor(Color.red);
		g.fillOval(centerX -60,centerY -120,(int) (radius*1.3),(int) (radius*1.3));
		g.setColor(Color.white);
		g.fillOval(centerX-45, centerY-105, radius, radius);
		
	}
	
	public void drawText()
	{   
	g.setColor(Color.black);
	g.setFont(new Font("Arial",Font.BOLD,110));
	g.drawString("P",centerX -25,centerY-15);
	g.setColor(Color.red); 
	int xCoord[] = {centerX-30,centerX-20,centerX+30,centerX+20};
	int yCoord[] = {centerY-20,centerY-10,centerY-98,centerY-108};
	g.fillPolygon(xCoord,yCoord,4);

	}
}