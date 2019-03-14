import java.util.*;
import java.io.*;
class armstrong
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int num=kb.nextInt();
		int clone=num;
		int digit=0;
		while(clone!=0)
		{
			digit++;
			clone/=10;
		}
		int sum=0;
		int check=num;
		while(check!=0)
		{
			sum+= Math.pow(check%10,digit);
			check/=10;
		}
		if(sum==num)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
