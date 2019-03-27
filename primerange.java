import java.util.*;
import java.io.*;
class primerange
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int l=kb.nextInt();
		int r=kb.nextInt();
		int count=0;
		for(int i=l;i<=r;i++)
		{
			int flag=isprime(i);
			if(flag==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static int isprime(int num)
	{
		int fact=0;
		for(int j=1;j<=num;j++)
		{
			if(num%j==0)
			{
				fact++;
			}
		}
		if(fact==2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
