import java.util.*;
import java.io.*;
class prime_num_interval
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner (System.in);
		int m=kb.nextInt();
		int n=kb.nextInt();
		for(int i=m+1;i<n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
	}
}
