
// Lab30st.java
// The Screen Saver Program
// Student Version



import java.awt.event.*;


public class Lab30a
{    
	public static void main(String args[])  
	{
		GfxApp gfx = new GfxApp();
		gfx.setSize(800,600);
		gfx.addWindowListener(new WindowAdapter() {public void
			windowClosing(WindowEvent e) {System.exit(0);}});
		gfx.show();
	}
}
