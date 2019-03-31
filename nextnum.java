import java.util.*;
import java.io.*;
class nextnum
{
	public static void main(String [] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		int count=0,sum=num;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		if(count<=100000000000l)
		{
			System.out.println(sum+1);
		}
	}
}
