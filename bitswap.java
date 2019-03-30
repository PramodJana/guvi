import java.io.*;
import java.util.*;
class bitswap
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		int b=kb.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}
}
