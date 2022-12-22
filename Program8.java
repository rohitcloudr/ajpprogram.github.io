//8.	Develop a program to demonstrate the use of tree component.
import javax.swing.*;
import javax.swing.tree.*;

class Program8 extends JFrame
{
	JTree jt ;
	DefaultMutableTreeNode root,outnode,innode;
	Program8()
	{
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		root = new DefaultMutableTreeNode("Root");
		for(int i=1;i<=3;i++)
		{
			outnode = new DefaultMutableTreeNode(i);
			root.add(outnode);
			for(int j=1;j<=3;j++)
			{
				innode = new DefaultMutableTreeNode(i+" - "+j);
				outnode.add(innode);	
			}
		}
		jt = new JTree(root);
		add(jt);
		setVisible(true);
	}
	public static void main(String ar[])
	{
		new Program8();
	}
}