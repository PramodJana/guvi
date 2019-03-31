import java.io.*;
import java.util.*;
class numrange
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		if(num>0&&num<11)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
