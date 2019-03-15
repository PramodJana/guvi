import java.util.*;
import java.io.*;
class arithmeticprogression
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a=kb.nextInt();
		int d=kb.nextInt();
		int sum=a;
		int sums=a;
		while((n-1)!=0)
		{
			sum=sum+d;
			sums=sums+sum;
			n--;
		}
		System.out.println(sums);
	}
}
