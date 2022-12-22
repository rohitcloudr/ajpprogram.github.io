//7.	Develop a program to demonstrate use of ScrollPane in Swing.
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Program7 extends JFrame
{
	ImageIcon i = new ImageIcon("img1.jpg");
	JLabel l = new JLabel(i);
	JScrollPane s;
	Container c;
	Program7()
	{
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		s = new JScrollPane(l,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		c.add(s);
		c.setLayout(new FlowLayout());
		setVisible(true);
	
	}
	public static void main(String ar[])
	{
		new Program7();
	}
}