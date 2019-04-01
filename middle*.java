import java.io.*;
import java.util.*;
class middle
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		int len=str.length();
		if(len%2==0)
		{
			for(int i=0;i<len;i++)
			{
				if((i==len/2)||(i==(len/2)-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
		else
		{
			
			for(int i=0;i<len;i++)
			{
				if(i==len/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
