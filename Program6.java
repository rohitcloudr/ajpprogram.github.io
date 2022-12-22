//6.	Write a program to develop a frame to select the different states of India using JComboBox.
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Program6 extends JFrame 
{
	JComboBox jc ;
	Program6()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jc = new JComboBox();
		jc.addItem("Pune");
		jc.addItem("Solapur");
		jc.addItem("Mumbai");
		jc.addItem("Bali");
		jc.addItem("LA");
		jc.addItem("New York");
		jc.addItem("kolhapur");
		jc.addItem("Hydrabad");
		jc.addItem("Nagpur");
		jc.addItem("Nashik");

		add(jc);	
		setSize(400,400);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String ar[])
	{
		new Program6();
	}
}