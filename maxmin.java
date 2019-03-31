import java.io.*;
import java.util.*;
class maxmin
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int size=kb.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=kb.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int j=0;j<size;j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		System.out.println(min+" "+max);
	}
}
