import java.io.*;
import java.util.*;
class repeatonce
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		if(num>0&&num<100001)
		{
			int a[]=new int[num];
			for(int i=0;i<num;i++)
			{
				a[i]=kb.nextInt();
			}
			int max=findmax(a,num);
			int count[]=new int[max+1];
			for(int j=0;j<=max;j++)
			{
				count[j]=0;
			}
			for(int k=0;k<num;k++)
			{
				count[a[k]]=count[a[k]]+1;
			}
			for(int z=0;z<=max;z++)
			{	
				if(count[z]==1)
				{
					System.out.println(z);break;
				}
			}
		}
	}
	
	public static int findmax(int arr[],int num)
	{
		int max=arr[0];
		for(int i=0;i<num;i++)
		{
			if(arr[i]>max)
			max=arr[i];
		}
		return max;
	}
}
