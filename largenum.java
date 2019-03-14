import java.util.*;
import java.io.*;
class largenum
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int num1,num2,num3;
		num1=kb.nextInt();
		num2=kb.nextInt();
		num3=kb.nextInt();
		if((num1>num2)&&(num1>num3))
		{
			System.out.println(num1);
		}
		else if((num2>num1)&&(num2>num3))
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println(num3);
		}
	}
}
