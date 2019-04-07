import java.io.*;
import java.util.*;
class extraspace
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		if(len<100001)
		{
			String after = str.trim().replaceAll(" +", " ");
			System.out.println(after);
		}
	}
}
