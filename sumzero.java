import java.io.*;
import java.util.*;
class sumzero
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		if(n>0&&n<100001)
		{
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=kb.nextInt();
			}
			for(int a=0;a<n;a++)
			{
				for(int b=a+1;b<n;b++)
				{
					if(arr[a]+arr[b]==0)
					{
						System.out.println(arr[a]+" "+arr[b]);
					}
				}
			}
		}
	}
}
