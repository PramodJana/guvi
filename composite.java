import java.io.*;
import java.util.*;
class composite
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		int count=0,i=1;
		while(i<=num)
		{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
