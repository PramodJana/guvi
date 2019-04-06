import java.util.*;
import java.io.*;
class player24
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		boolean flag=isnumeric(str);
		if(flag==true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	public static boolean isnumeric(String str)
	{
		try
		{
			Double.parseDouble(str);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
