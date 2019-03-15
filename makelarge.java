import java.util.*;
import java.io.*;
class makelarge
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		if((n>0)&&(n<100001))
		{
			int a[]= new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=kb.nextInt();
			}
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n-1;k++)
				{
					if(a[k]<a[k+1])
					{
						int temp=a[k];
						a[k]=a[k+1];
						a[k+1]=temp;
					}
				}
			}
			int sum=0;
			for(int x=0;x<n;x++)
			{
				sum=sum*10+a[x];
			}
			System.out.println(sum);
		}
	}
}
