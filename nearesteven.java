import java.io.*;
import java.util.*;
class nearesteven
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		if(num%2==0)
		{
			System.out.println(num);
		}
		else
		{
			System.out.println(num-1);
		}
	}
}
