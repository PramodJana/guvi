import java.util.*;
import java.io.*;
class indexnum
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int num=kb.nextInt();
		if((num>0)&&(num<100001))
		{
			int flag=-1;
			int a[]= new int[num];
			for(int i=0;i<num;i++)
			{
				a[i]=kb.nextInt();
			}
			for(int j=0;j<num;j++)
			{
				if(a[j]==j)
				{
					flag=1;
					System.out.print(a[j]+" ");
				}
			}
			if(flag==-1)
			{
				System.out.println(flag);
			}
			System.out.println();
		}
	}
}
