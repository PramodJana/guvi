import java.io.*;
import java.util.*;
class numexists
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int size=kb.nextInt();
		int a[]=new int[size];
		int check=kb.nextInt();
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			a[i]=kb.nextInt();
			if(a[i]==check)
			flag=true;
		}
		if(flag==true)	
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
