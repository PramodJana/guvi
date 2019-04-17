import java.io.*;
import java.util.*;
class repeat
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int n=kb.nextInt();
		if(n>0&&n<100001)
		{
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=kb.nextInt();
			}
			int flag=0,res=0;
			for(int j=0;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[j]==arr[k])
					{
						flag=1;
						res=arr[j];
						break;
					}
				}
				if(flag==1)
				break;
			}
			if(flag==1)
			{
				System.out.println(res);
			}
			else
			{
				System.out.println("unique");
			}
		}
	}
}
