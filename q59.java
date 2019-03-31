import java.util.*;
import java.io.*;
public class q59
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		int digit=0;
		while(num!=0)
		{
			digit++;
			num/=10;
		}
	System.out.println(digit);
	}
}
