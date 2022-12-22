//5.Write a program which creates Menu of different colors and disable menu item for Black color.

import java.awt.*;
import java.awt.event.*;

class Program5 extends Frame 
{
	MenuBar mbr;
	Menu color;
	MenuItem red,green,black;
	Program5()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		mbr = new MenuBar();
		color = new Menu("Color");
		red = new MenuItem("Red");
		green = new MenuItem("Green");
		black = new MenuItem("Black");
		black.setEnabled(false);
		color.add(red);color.add(green);color.add(black);
		mbr.add(color);
		setMenuBar(mbr);
		setVisible(true);
		setSize(400,400);
	}
	public static void main(String ar[])
	{
		new Program5();
	}
}
		