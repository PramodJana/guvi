import java.io.*;
import java.util.*;
class swapnum
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		int b=kb.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
}
