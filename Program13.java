//13.	Write a program using JTextField to perform addition of two numbers.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program13 extends JFrame implements ActionListener 
{
	JTextField t1,t2;
	JLabel l1,l2,l3;
	JButton b;
	Program13()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,400);
		setLayout(new FlowLayout());
		l1 = new JLabel("First NO ");
		l2 = new JLabel("Second NO ");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		b = new JButton("ADD");
		l3 = new JLabel(" ");
		add(l1);add(t1);add(l2);add(t2);add(b);add(l3);
		b.addActionListener(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int i = Integer.parseInt(t1.getText());
		int j = Integer.parseInt(t2.getText());
		int res = i+j;
		l3.setText(" "+res);
	}
	public static void main(String ar[])
	{
		new Program13();
	}
}