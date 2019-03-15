import java.util.*;
import java.io.*;
class apperonce
{
	public static void main(String [] args)
	{
		Scanner kb= new Scanner(System.in);
		int n=kb.nextInt();
		if((n>0)&&(n<100001))
		{	int a[]= new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=kb.nextInt();
			}
			int max=a[0];
			for(int j=0;j<n;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
				}
			}
			int check[]=new int[max+1];
			for(int k=0;k<max+1;k++)
			{
				check[k]=0;
			}
			for(int x=0;x<n;x++)
			{
				check[a[x]]+=1;
			}
			for(int y=0;y<max+1;y++)
			{
				if(check[y]==1)
				{	
					System.out.print(y+" ");
				}
			}
			System.out.println();
		}
	}
}
