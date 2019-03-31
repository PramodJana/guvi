import java.io.*;
import java.util.*;
class producteven
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int num1=kb.nextInt();
		int num2=kb.nextInt();
		if((num1*num2)%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
