import java.io.*;
import java.util.*;
class skate
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int count=0;
		if(n>0&&n<1001)
		{
			for(int i=0;i<n;i++)
			{
				int a=kb.nextInt();
				int b=kb.nextInt();
				if(a<b)
				count++;
			}
			System.out.println(count);
		}
	}
}
