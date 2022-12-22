//9.	Develop a program which will identify which key is pressed such as functional keys,arraow keys.
import java.awt.*;
import java.awt.event.*;

class Program9 extends Frame implements KeyListener 
{
	Label l;
	Program9()
	{
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		l = new Label(" ");
		add(l);	
		addKeyListener(this);
		setSize(400,400);
		setVisible(true);
	}
	public void keyPressed(KeyEvent e)
	{
		int code = e.getKeyCode();
		switch(code)
		{
			case KeyEvent.VK_F1 : l.setText("F1 is pressed");
				break;
			case KeyEvent.VK_F2 : l.setText("F2 is Pressed");
				break;
			case KeyEvent.VK_F3 : l.setText("F3 is pressed");
				break;
			case KeyEvent.VK_F4 : l.setText("F4 is Pressed");
				break;
			case KeyEvent.VK_F5 : l.setText("F5 is pressed");
				break;
			case KeyEvent.VK_F6 : l.setText("F6 is Pressed");
				break;
			case KeyEvent.VK_F7 : l.setText("F7 is pressed");
				break;
			case KeyEvent.VK_F8 : l.setText("F8 is Pressed");
				break;
			case KeyEvent.VK_F9 : l.setText("F9 is pressed");
				break;
			case KeyEvent.VK_F10 : l.setText("F10 is Pressed");
				break;
			case KeyEvent.VK_F11 : l.setText("F11 is pressed");
				break;
			case KeyEvent.VK_F12 : l.setText("F12is Pressed");
				break;
			case KeyEvent.VK_UP : l.setText("Up key is Pressed");
				break;
			case KeyEvent.VK_DOWN : l.setText("Down key is Pressed");
				break;
			case KeyEvent.VK_LEFT : l.setText("Left Key is Pressed");
				break;
			case KeyEvent.VK_RIGHT : l.setText("Right key is Pressed");
				break;
			default : 
				l.setText(" Character Generation key is pressed");
		}
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {} 
	public static void main( String ar[])
	{
		new Program9();
	}
}

