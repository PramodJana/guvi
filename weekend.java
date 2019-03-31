import java.io.*;
import java.util.*;
class weekend
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		switch(str)
		{
			case "Saturday":
			System.out.println("yes");
			break;	
			case "Sunday":
			System.out.println("yes");
			break;
			default:
			System.out.println("no");
		}
	}
}
