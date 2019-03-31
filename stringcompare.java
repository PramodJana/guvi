import java.io.*;
import java.util.*;
class stringcompare
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		int len=str.length();
		String str1=kb.next();
		int len1=str1.length();
		if(len>len1)
		{
			System.out.println(str);
		}
		else
		{
			System.out.println(str1);
		}
	}
}
