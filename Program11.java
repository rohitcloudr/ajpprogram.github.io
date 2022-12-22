//11.	Write a program to change the background color of Applet when user performs events using Mouse.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="Program11" width=400 height=400 ></applet>

public class Program11 extends Applet implements MouseListener
{
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseEntered(MouseEvent e)
	{
		setBackground(Color.BLACK);
	}
	public void mouseExited(MouseEvent e)
	{
		setBackground(Color.RED);
	}
	public void mouseClicked(MouseEvent e)
	{
		setBackground(Color.PINK);
	}
	public void mousePressed(MouseEvent e)
	{
		setBackground(Color.GREEN);
	}
	public void mouseReleased(MouseEvent e)
	{
		setBackground(Color.CYAN);
	}
}