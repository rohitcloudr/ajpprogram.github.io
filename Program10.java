//10.Develop a program to accept two numbers and display product of two numbers when user pressed Multiply button.
import java.awt.*;
import java.awt.event.*;

class Program10 extends Frame implements ActionListener
{
	Label l1 , l2, l3;
	TextField t1 ,t2;
	Button b;
	Program10()
	{
		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		l1 = new Label("Number 1");
		l2 = new Label("Number 2 ");
		l3 = new Label(" ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		b = new Button("Multiply");	
		b.addActionListener(this);
		setLayout(new FlowLayout());
		setSize(250,400);
		setVisible(true);
		add(l1);add(t1);add(l2);add(t2);add(b);add(l3);
	}

	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		int res = n1*n2;
		l3.setText(" "+res);
	}

	public static void main(String ar[])
	{
		new Program10();
	}
}