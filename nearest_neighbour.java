import java.io.*;
import java.util.*;
class nearest_neighbour
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		if(n>=4&&n<=100000)
		{
			int num[]=new int[n];
			for(int i=0;i<n;i++)
			{
				num[i]=kb.nextInt();
			}
			int max=findmax(num);
			int arr[]=new int[3];
			int count=0,i=1;
			while(count<3&&i<=max)
			{
				int flag=0;
				int left=k-i;
				int right=k+i;
				flag=find(num,left);
				if(flag==1)
				{
					arr[count]=left;
					count++;
					if(count==3)
					break;
				}
				flag=0;
				flag=find(num,right);
				if(flag==1)
				{
					arr[count]=right;
					count++;
					if(count==3)
					break;
				}
				flag=0;
				i++;
			}
			for(int q=0;q<3;q++)
			{
				System.out.print(arr[q]+" ");
			}System.out.println();
		}
	}
	
	public static int findmax(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			max=arr[i];
		}
		return max;
	}
		
	public static int find(int arr[], int key)
	{
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				flag=1;
				break;
			}
		}
		return flag;
	}
}
