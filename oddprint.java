import java.io.*;
import java.util.*;
class oddprint
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if((int)str.charAt(i)%2!=0)
			{
				System.out.print(str.charAt(i)+" ");
			}
		}
		System.out.println();
	}
}
