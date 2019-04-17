import java.io.*;
import java.util.*;
class checksort
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		int size=kb.nextInt();
		if(size>0&&size<100001)
		{
			int arr[]=new int[size];
			for(int i=0;i<size;i++)
			{
				arr[i]=kb.nextInt();
			}
			boolean flag=true;
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]>arr[j+1])
				flag=false;
			}
			if(flag==true)
			System.out.println("yes");
			else
			System.out.println("no");
		}
	}
}			
