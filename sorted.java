import java.io.*;
import java.util.*;
class sorted
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int arr[]=new int[n];
		if(n>0&&n<=1000)
		{
			for(int i=0;i<n;i++)
			{
				arr[i]=kb.nextInt();
			}
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n-1;k++)
				{
					if(arr[k]>arr[k+1])
					{
						int temp=arr[k];
						arr[k]=arr[k+1];
						arr[k+1]=temp;
					}
				}
			}
			for(int z=0;z<n;z++)
			{
				System.out.print(arr[z]+" ");
			}
			System.out.println();
		}
	}
}
