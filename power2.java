import java.io.*;
import java.util.*;
class power2
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();int digit=2,flag=0;
		while(digit<=num)
		{
			if(num==digit)
			{
				flag=1;
				break;
			}
			else
			{
			digit*=2;
			}
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
