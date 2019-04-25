import java.io.*;
import java.util.*;
class star
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
			ArrayList<String> star=new ArrayList<String>();
			int superstar=ismax(arr);
			for(int j=0;j<n;j++)
			{	int a=arr[j],flag=1;
				for(int k=j+1;k<n;k++)	
				{
					int b=arr[k];
					if(b>a)
					{
						flag=0;
						break;
					}
				}
				if(flag==1)
				star.add(Integer.toString(a));
			}
			Iterator<String> itr=star.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next()+" ");
			}
			System.out.println();
			System.out.println(superstar);
		}
	}
	
	public static int ismax(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
}
