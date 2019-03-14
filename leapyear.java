import java.util.*;
import java.io.*;
class leapyear
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		int year=kb.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
