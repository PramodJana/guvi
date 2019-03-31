import java.io.*;
import java.util.*;
class printdigit
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		String str=kb.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}
}
