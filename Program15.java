//15.	Develop a program using InetAddress class to retrieve IP address of computer when hostname is entered by the user

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Program15
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Host Name : ");
		String Hname = sc.next();
		try 
		{
			InetAddress ip = InetAddress.getByName(Hname);
			System.out.println("Host Name : "+ip.getHostName());
			System.out.println("IP Address : "+ip.getHostAddress());
		}
		catch(Exception e){}
	}
}