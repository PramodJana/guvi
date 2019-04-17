import java.io.*;
import java.util.*;
class oddeven
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		if(num>0&&num<100001)
		{
			int arr[]=new int[num];
			for(int i=0;i<num;i++)
			{
				arr[i]=kb.nextInt();
			}
			for(int j=0;j<num;j++)
			{
				if(j%2==0)
				{
					if(arr[j]%2!=0)
					System.out.print(arr[j]+" ");
				}
				else
				{
					if(arr[j]%2==0)
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
		}
	}
}
