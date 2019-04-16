import java.io.*;
import java.util.*;
class player41
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();int k=kb.nextInt();
		boolean flag=false;
		while(k<=num)
		{
			if(k==num)
			{
				flag=true;break;
			}
			else
			{
				k*=k;
			}
		}
		if(flag==true)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}

