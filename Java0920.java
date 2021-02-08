// Java0920.java
// Train case study, Stage #6
// This program finally adds the <Train> class  
// A train has train cars.  The first train car is the locomotive.  
// The last train car is the Caboose.


import java.awt.*;
import java.applet.*;


public class Java0920 extends Applet
{
	public void paint(Graphics g)
	{
		Train t = new Train(g,55);						
	}
}


class TrainCar
{
	private Color carColor;
	
	public TrainCar(Graphics g, Color cc, int x)
	{
		carColor = cc;
		g.setColor(carColor);
		g.fillRect(x,250,150,100);
		g.setColor(Color.black);
		g.fillOval(x+5,325,50,50);
		g.fillOval(x+95,325,50,50);
	}		
}


class Locomotive extends TrainCar
{
	private int x;
	
	public Locomotive(Graphics g, Color cc, int x1)
	{
		super(g,cc,x1);
		x = x1;
		drawScoop(g);
		drawFunnel(g);
	}	
	
	public void drawScoop(Graphics g)
	{
		Polygon scoop = new Polygon();
		scoop.addPoint(x,300);
		scoop.addPoint(x,350);
		scoop.addPoint(x-50,350);
	    g.setColor(Color.black);
	    g.fillPolygon(scoop);
	}
	
	public void drawFunnel(Graphics g)
	{
		Polygon funnel = new Polygon();
		funnel.addPoint(x+20,250);
		funnel.addPoint(x+20,220);
		funnel.addPoint(x,200);
		funnel.addPoint(x,190);
		funnel.addPoint(x+60,190);
		funnel.addPoint(x+60,200);
		funnel.addPoint(x+40,220);
		funnel.addPoint(x+40,250);
	    g.setColor(Color.black);
	    g.fillPolygon(funnel);
	}
}


class Caboose extends TrainCar
{
	private int x;
	
	public Caboose(Graphics g, int x1)
	{
		super(g,Color.red,x1);
		x = x1;
		drawWindows(g);
		drawTop(g);
	}	
	
	public void drawWindows(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(x+30,280,30,30);
	    g.fillRect(x+90,280,30,30);
	}
	
	public void drawTop(Graphics g)
	{
	    g.setColor(Color.red);
	    g.fillRect(x+30,235,90,15);
	    g.setColor(Color.black);
	    g.fillRect(x+25,235,100,5);
	}
}



class Train 
{
	private Locomotive loc;
	private TrainCar tc1;
	private TrainCar tc2;
	private TrainCar tc3;
	private TrainCar tc4;
	private Caboose cab;
	
	public Train(Graphics g, int x)
	{
		loc = new Locomotive(g,Color.blue,x);
		tc1 = new TrainCar(g,Color.green,x+160);
		tc2 = new TrainCar(g,Color.yellow,x+320);
		tc3 = new TrainCar(g,Color.magenta,x+480);
		tc4 = new TrainCar(g,Color.cyan,x+640);
		cab = new Caboose(g,x+800);
	}	
}