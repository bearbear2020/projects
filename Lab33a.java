// Lab33ast.java
// This is the student Version of the Lab33a assignment.

import java.awt.*;
import java.awt.event.*;


public class Lab33a
{
	public static void main(String args[])
	{
		GfxApp gfx = new GfxApp();
		gfx.setSize(1000,750);
		gfx.addWindowListener(new WindowAdapter() {public void
		windowClosing(WindowEvent e) {System.exit(0);}});
		gfx.show();
	}
}



