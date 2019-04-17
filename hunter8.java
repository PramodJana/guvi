import java.io.*;
import java.util.*;
class hunter8
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		if(n>0&&n<1001)
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
					for(int c=b+1;c<n;c++)
					{
						if(arr[a]+arr[b]==arr[c])
						{
							System.out.println(arr[a]+" "+arr[b]+" "+arr[c]);
						}
					}
				}
			}
		}
	}
}
