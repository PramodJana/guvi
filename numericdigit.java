import java.util.*;
import java.io.*;
class numericdigit
{
	public static void main(String [] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		if(count<=100000000000l)
		{
			System.out.println(count);
		}
	}
}
