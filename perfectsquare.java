import java.io.*;
import java.util.*;
import java.math.*;
class perfectsquare
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int num1=kb.nextInt();
		int num2=kb.nextInt();
		if((int)Math.sqrt(num1*num2)<Math.sqrt(num1*num2))
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
