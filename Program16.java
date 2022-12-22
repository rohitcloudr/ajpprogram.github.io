//16.Write a program using URL and URLConnection class to retrieve the date,content type,contentlength information of any enetered URL.

import java.net.*;
class Program16 
{
	public static void main(String []ar) throws Exception
	{
		URL hp = new URL("http://www.msbte.org.in");
		URLConnection c = hp.openConnection();
		System.out.println("Content Lenght : "+c.getContentLength());
		System.out.println("Content Type : "+c.getContentType());
		System.out.println("Date : "+c.getDate());
		System.out.println("Content : "+c.getContent());
		System.out.println("Content : "+c.getContentEncoding());
	}
}