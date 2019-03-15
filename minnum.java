import java.util.*;
import java.io.*;
class minnum
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		int num=kb.nextInt();
		if((num>0)&&(num<100001))
		{
			int a[]= new int[num];
			for(int i=0;i<num;i++)
			{
				a[i]=kb.nextInt();
			}
			int min=a[0];
			for(int j=0;j<num;j++)
			{
				if(min>a[j])
				{
					min=a[j];
				}
			}
			System.out.println(min);
		}
	}
}
