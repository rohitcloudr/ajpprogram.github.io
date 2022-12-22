//14.	Write a program using JPasswordField to accept password from user and if the length is less than 6 characters then error message should be displayed Password length must be >6 characters
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Program14 extends JFrame implements ActionListener 
{
	JTextField un ; 
	JPasswordField pw;
	JButton b ; 
	JLabel l1, l2;
	Program14()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(250,400);
		
		un = new JTextField(10);
		pw = new JPasswordField(10);
		l1 = new JLabel("UserName :)");
		l2 = new JLabel("Password : ");
		b = new JButton("Submit");
		b.addActionListener(this);
		add(l1);add(un);add(l2);add(pw);add(b);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str = pw.getText();
		int len = str.length();
		if( len >6)
		{
			JOptionPane.showMessageDialog(this,"Register Successful");
		}
		else  
		{
			JOptionPane.showMessageDialog(this,"Passwod must be 6 char long");
		}
	}
	public static void main(String ar[] )
	{
		new Program14();
	}
}