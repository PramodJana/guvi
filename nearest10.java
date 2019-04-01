import java.io.*;
import java.util.*;
class nearest10
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		while(num%10!=0)
		{
			num++;
		}
		System.out.println(num);
	}
}

