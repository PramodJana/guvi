import java.util.*;
import java.io.*;
class armstrong_interval
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int m=kb.nextInt();
		int n=kb.nextInt();
		for(int i=m+1;i<n;i++)
		{
			int clone=i;
			int digit=0;
			while(clone!=0)
			{
				digit++;
				clone/=10;
			}
			int sum=0;
			int check=i;
			while(check!=0)
			{
				sum+= Math.pow(check%10,digit);
				check/=10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}
	}
}
