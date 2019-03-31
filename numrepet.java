import java.io.*;
import java.util.*;
class numrepet
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int size=kb.nextInt();
		int a[]=new int[size];
		int check=kb.nextInt();
		int count=0;
		for(int i=0;i<size;i++)
		{
			a[i]=kb.nextInt();
			if(a[i]==check)
			count++;
		}
		System.out.println(count);
	}
}
