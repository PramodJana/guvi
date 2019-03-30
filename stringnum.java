import java.util.*;
import java.io.*;
class stringnum
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
}
