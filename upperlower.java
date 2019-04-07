import java.util.*;
import java.io.*;
class upperlower
{
	public static void main(String [] args)
	{
		Scanner kb= new Scanner(System.in);
		String str=kb.next();
		int len=str.length();
		if(len<10000001)
		{
			for(int i=0;i<len;i++)
			{		
				char st=str.charAt(i);
				change(st);
			}System.out.println();
		}
	}



	public static void change(char ch)
	{
		if(ch>='A'&&ch<='Z')
		{
			int in=(int)ch+32;
			System.out.print((char)in);
		}
		else
		{
			int in=(int)ch-32;
			System.out.print((char)in);
		}
	}
}
