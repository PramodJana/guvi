import java.util.*;
import java.io.*;
class camelcase
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		char a[]=new char[len];
		for(int i=0;i<len;i++)
		{
			a[i]=str.charAt(i);
		}
		for(int j=0;j<len;j++)
		{
			if(j==0)
			{	
				if((a[j]>='a')&&(a[j]<='z'))
				{
					a[j]=(char)(((int)a[j])-32);
				}
			}
			else if(a[j]==' ')
			{	j+=1;
				if((a[j+1]>='a')&&(a[j+1]<='z'))
				{
					a[j]=(char)(((int)a[j])-32);
				}
			}
			else
			{
				if((a[j]>='A')&&(a[j]<='Z'))
				{
					a[j]=(char)(((int)a[j])+32);
				}
			}
		}
		for(int k=0;k<len;k++)
		{
			System.out.print(a[k]);
		}
		System.out.println();
	}
}
