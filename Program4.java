//4.	Write a program to generate following output(GridBagLayout)
import java.awt.*;
import javax.swing.*;

class Program4 extends JFrame 
{
	GridBagLayout g;
	GridBagConstraints c;
	Button b1,b2,b3,b4,b5;
	Program4()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g = new GridBagLayout();
		c = new GridBagConstraints();
		setLayout(g);
		
		b1 = new Button("Button one");
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		g.setConstraints(b1,c);

		b2 = new Button("Button two");
		c.gridx = GridBagConstraints.RELATIVE;
		g.setConstraints(b2,c);
		
		b3 = new Button("Button three");
		c.gridx = 0;
		c.gridy = 1;
		c.ipady = 35;
		g.setConstraints(b3,c);
		
		b4 = new Button("Button four");
		c.gridx = GridBagConstraints.RELATIVE;
		g.setConstraints(b4,c);
		
		b5 = new Button("Button five");
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 2;
		g.setConstraints(b5,c);
		
		add(b1);add(b2);add(b3);add(b4);add(b5);
		setSize(400,400);
		setVisible(true);

	}
	public static void main(String ar[])
	{
		new Program4();
	}
}
		