import java.util.*;
import java.io.*;
class numeric
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		boolean flag=isnumeric(str);
		if(flag==true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
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
