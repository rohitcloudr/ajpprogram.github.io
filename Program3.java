//3.Write a program to demonstrate the use of BorderLayout.
import java.awt.*;
import java.awt.event.*;

class Program3 extends Frame
{
	Button b1,b2,b3,b4,b5;
	Program3()
	{
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		b1 = new Button("North");
		b2 = new Button("South");
		b3 = new Button("Center");	
		b4 = new Button("East");
		b5 = new Button("West");
		
		setSize(400,400);
		setLayout(new BorderLayout());
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.CENTER);
		add(b4,BorderLayout.EAST);
		add(b5,BorderLayout.WEST);
		setVisible(true);
	}
	public static void main(String[] ar)
	{
		new Program3();
	}
	
}