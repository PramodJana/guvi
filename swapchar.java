import java.util.*;
import java.io.*;
class swapchar
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		char a[]=new char[len];
		for(int i=0;i<len;i++)
		{
			a[i]=str.charAt(i);
		}
		for(int j=0;j<len;j+=2)
		{
			char ch=a[j];
			a[j]=a[j+1];
			a[j+1]=ch;
		}
		for(int k=0;k<len;k++)
		{
			System.out.print(a[k]);
		}
		System.out.println();
	}
}
