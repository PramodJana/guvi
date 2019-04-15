import java.io.*;
import java.util.*;
class evenfactor
{
	public static void main(String [] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		if(num>0&&num<1001)
		{
			for(int i=1;i<=num;i++)
			{
				if((num%i==0)&&(i%2==0))
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
				
