import java.io.*;
import java.util.*;
class arraysubset
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		if(n>0&&n<1000001)
		{
			int arr1[]=new int[n];
			int arr2[]=new int[m];
			for(int i=0;i<n;i++)
			{
				arr1[i]=kb.nextInt();
			}
			for(int j=0;j<m;j++)
			{
				arr2[j]=kb.nextInt();
			}
			for(int a=0;a<m;a++)
			{
				for(int b=0;b<n;b++)
				{
					if(arr1[b]==arr2[a])
					{
						arr1[b]=0;
						arr2[a]=0;
					}
				}
			}
			int flag=1;
			for(int k=0;k<m;k++)
			{
				if(arr2[k]!=0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			System.out.println("YES");
			else
			System.out.println("NO");
		}
	}
}
