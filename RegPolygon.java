import java.awt.*;


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

