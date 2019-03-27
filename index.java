import java.io.*;
import java.util.*;
class index
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=kb.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			System.out.println(a[j]+" "+j);
		}
	}
}
