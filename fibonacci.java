import java.util.*;
import java.io.*;
class fibonacci
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int num=kb.nextInt();
		if(num>2)
		{
			int a=1;
			int b=1;
			System.out.print(a+" "+b+" ");
			int c;
			num=num-2;
			while(num!=0)
			{
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
				num--;
			}
		System.out.println();
		}
		else
		{
			if(num==1)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("1 1");
			}
		}
	}
}
