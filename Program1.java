//1.Develop an applet/application using List Components to add names of 10 different cities.

import java.awt.*;
import java.applet.*;

//<applet code="Program1" width=400 height=400></applet>

public class Program1 extends Applet 
{
	List l1; 
	public void init()
	{
		l1 = new List();
		l1.add("Pune");
		l1.add("Solapur");
		l1.add("Mumbai");
		l1.add("Bali");
		l1.add("LA");
		l1.add("New York");
		l1.add("kolhapur");
		l1.add("Hydrabad");
		l1.add("Nagpur");
		l1.add("Nashik");

		add(l1);
		setLayout(new FlowLayout());	
	}
}