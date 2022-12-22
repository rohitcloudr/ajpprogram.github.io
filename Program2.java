//2.Write a program to demonstrate the use of GridLayout.

import java.awt.*;
import java.awt.event.*;

class Program2 extends Frame
{
	TextField t1 ; 
	TextArea t2; 
	Button b ;
	Label l1, l2;
	Program2()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		l1 = new Label("Name");
		l2 = new Label("Address");	
		t1 = new TextField(10);
		t2  = new TextArea(5,10);
		b = new Button("Submit");
		
		add(l1);add(t1);add(l2);add(t2);add(b);
		setLayout(new GridLayout(3,2));
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String ar[])
	{
		new Program2();
	}
}