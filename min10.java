import java.io.*;
import java.util.*;
class min10
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=kb.nextInt();
		}
		int min=a[0];
		for(int j=0;j<10;j++)
		{
			if(min>a[j])
			{
				min=a[j];
			}
		}
		System.out.println(min);
	}
}
