import java.util.*;
import java.io.*;
class primefacor
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		if(num>1&&num<100001)
		{
			for(int i=2;i<=num;i++)
			{
				if((isprime(i)==1)&&(factor(i,num)==1))
				{
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}

	public static int isprime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			count++;
		}
		if(count==2)
		{return 1;}
		else
		return 0;
	}

	public static int factor(int i,int num)
	{
		if(num%i==0)
		{return 1;}
		else
		{return 0;}
	}
}
