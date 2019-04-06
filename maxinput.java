import java.io.*;
import java.util.*;
class maxinput
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
			if((k<=n)&&(k<=100000))
			{
				int a[]=new int[n];
				int b[]=new int[k];
				int c[]=new int[n+k],z=0;;
				for(int i=0;i<n;i++)
				{
					a[i]=kb.nextInt();
					c[i]=a[i];z=i;
				}
				for(int j=0;j<k;j++)
				{
					b[j]=kb.nextInt();
				}
				for(int x=0;x<k;x++)
				{
					c[z++]=b[x];
					int max=ismax(c);
					System.out.print(max+" ");
				}
			}
			System.out.println();
	}
	
	public static int ismax(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			max=arr[i];
		}
		return max;
	}
}
