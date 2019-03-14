import java.util.*;
import java.io.*;
class primenum
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
