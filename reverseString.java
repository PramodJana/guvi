import java.io.*;
import java.util.*;
class reverseString
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		int n=s.length();
		if(n>0&&n<100001)
		{
			String str[]=s.trim().split(" ");
			int len=str.length;
			for(int i=0;i<len;i++)
			{
				rev(str[i]);
			}
			System.out.println();
		}
	}


	public static void rev(String str)
	{
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print(" ");
	}
}
