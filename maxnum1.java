import java.util.*;
import java.io.*;
class maxnum1
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		int num=kb.nextInt();
			int a[]= new int[10];
			for(int i=0;i<10;i++)
			{
				a[i]=kb.nextInt();
			}
			int max=a[0];
			for(int j=0;j<10;j++)
			{
				if(max<a[j])
				{
					max=a[j];
				}
			}
			System.out.println(max);
	}
}
