import java.io.*;
import java.util.*;
class addeven
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		int b=kb.nextInt();
		if((a+b)%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
