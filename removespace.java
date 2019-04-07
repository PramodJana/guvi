import java.io.*;
import java.util.*;
class removespace
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		if(len<1000001)
		{
			System.out.println(str.trim().replaceAll(" +",""));
		}
	}
}
