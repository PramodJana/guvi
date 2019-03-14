import java.util.*;
import java.io.*;
class factorial_limit
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		if(num<=20)
		{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact*=i;
			}
			System.out.println(fact);
		}
	}
}
