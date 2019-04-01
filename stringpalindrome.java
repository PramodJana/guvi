import java.io.*;
import java.util.*;
class stringpalindrome
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		String str=kb.next();
		int a[]=new int[str.length()];
		int b[]=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			a[i]=str.charAt(i);
			b[str.length()-i-1]=str.charAt(i);
		}
		int flag=0;
		for(int j=0;j<str.length();j++)
		{
			if(a[j]!=b[j])
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
