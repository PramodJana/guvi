import java.io.*;
import java.util.*;
import java.math.*;
class player29
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int num1=kb.nextInt();
		int num2=kb.nextInt();
		if((num1<=num2)&&(num2<100001))
		{
			int count=0;
			for(int i=num1;i<=num2;i++)
			{
				if((int)Math.sqrt(i)<Math.sqrt(i)){}
				else
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
