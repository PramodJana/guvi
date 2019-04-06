import java.io.*;
import java.util.*;
class stringsort
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();String arr[]=new String[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=kb.next();
		}
		Arrays.sort(arr);
		for(int m=0;m<num;m++)
		{
			for(int n=0;n<num-1;n++)
			{
				if(arr[n].length()>arr[n+1].length())
				{
				String temp=arr[n];
				arr[n]=arr[n+1];
				arr[n+1]=temp;
				}
			}
		}		
		for(int j=0;j<num;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
}
