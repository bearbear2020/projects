import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

class GfxApp extends Frame
{
	
	private int td = 200;		// time delay to slow down graphics display
	
	public void paint (Graphics g)
	{
		g.setFont(new Font("ARIAL",Font.BOLD,28));
		g.drawString("LAB 33A 80/100 POINT VERSION",300,50); 
		g.setFont(new Font("ARIAL",Font.BOLD,20));
		g.drawString("DRAWING A LINKED LIST AS A STACK",50,215); 
	g.drawString("DRAWING A LINKED LIST AS A QUEUE",50,415);   	// for 100 point version only
		drawStack(g);
		drawQueue(g);												// for 100 point version only
	}
	
	public void drawStack(Graphics g)
	{   
		GfxNode node1 = new GfxNode(g,600,215,'F',0,td);
		node1.enterData(g,'F',0);
	    node1.drawPointer(g,'P',2,0);
		
		GfxNode node2 = new GfxNode(g,650,215,'E',0,td);
		node2.enterData(g,'E',0);
		node2.drawPointer(g,'T',3,0);
		
		GfxNode node3 = new GfxNode(g,700,215,'D',0,td);
		node3.enterData(g,'D',0);
		node3.drawPointer(g,'T',4,0);
		
		GfxNode node4 = new GfxNode(g,750,215,'C',0,td);
		node4.enterData(g,'C',0);
		node4.drawPointer(g,'T',5,0);
		
		GfxNode node5 = new GfxNode(g,800,215,'B',0,td);
		node5.enterData(g,'B',0);
	    node5.drawPointer(g,'T',6,0);		
		
		GfxNode node6 = new GfxNode(g,850,215,'A',0,td);
		node6.enterData(g,'A',0);
		node6.drawPointer(g,'S',7,0);	
		
		node1.drawLetter(g, 'F', 600, 215);
		node1.drawLink(g,node2,0);
		node1.delay(1000);
		
		node2.drawLetter(g, 'E', 650, 215);
        node2.drawLink(g,node3,0);
		node2.delay(1000);
		
		node3.drawLetter(g, 'D', 700, 215);
        node3.drawLink(g,node4,0);
		node3.delay(1000);
		
		node4.drawLetter(g, 'C', 750, 215);
        node4.drawLink(g,node5,0);	
		node4.delay(1000);
		
		node5.drawLetter(g, 'B', 800, 215);
	    node5.drawLink(g,node6,0);	
		node5.delay(1000);
		
		node6.drawLetter(g, 'A', 850, 215);
		node6.drawNull(g,9);
		node6.drawLink(g,node1,0);	
		node6.delay(1000);

		}
	
	public void drawQueue(Graphics g)
	{
		GfxNode node1 = new GfxNode(g,600,415,'A',0,td);
		node1.enterData(g,'A',0);
		node1.drawPointer(g,'F',2,0);
		
		GfxNode node2 = new GfxNode(g,650,415,'B',0,td);
		node2.enterData(g,'B',0);
		node2.drawPointer(g,'T',3,0);
		
		GfxNode node3 = new GfxNode(g,700,415,'C',0,td);
		node3.enterData(g,'C',0);
		node3.drawPointer(g,'T',4,0);
		
		GfxNode node4 = new GfxNode(g,750,415,'D',0,td);
		node4.enterData(g,'D',0);
		node4.drawPointer(g,'T',5,0);
		
		GfxNode node5 = new GfxNode(g,800,415,'E',0,td);
		node5.enterData(g,'E',0);
		node5.drawPointer(g,'T',6,0);		
		
		GfxNode node6 = new GfxNode(g,850,415,'F',0,td);
		node6.enterData(g,'F',0);
		node6.drawPointer(g,'n',7,0);	
		
		
		node1.drawLink(g,node2,0);
		node1.drawLetter(g, 'A', 600, 415);
		node1.delay(1000);
		
		node2.drawLink(g,node3,0);
		node2.drawLetter(g, 'B', 650, 415);
		node2.delay(1000);
		
		node3.drawLink(g,node4,0);
		node3.drawLetter(g, 'C', 700, 415);
		node3.delay(1000);
		
		node4.drawLink(g,node5,0);	
		node4.drawLetter(g, 'D', 750, 415);
		node4.delay(1000);
		
		node5.drawLink(g,node6,0);	
		node5.drawLetter(g, 'E', 800, 415);
		node5.delay(1000);
		
		node6.drawLink(g,node6,0);	
		node6.drawPointer(g,'P',2,0);
		node6.drawLetter(g, 'F', 850, 415);
		node6.delay(1000);
		node6.drawNull(g,0);
	}
	

	

}
