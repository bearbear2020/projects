import java.awt.*;


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

