import java.util.*;
import java.io.*;
class q60
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int num;
		num=kb.nextInt();
		if(num<=100000)
		{
		if(num>0)
		{
			int sum=0;
			for(int i=0;i<=num;i++)
			{
				sum+=i;
			}
		System.out.println(sum);
		}
		}
		
	}
}
