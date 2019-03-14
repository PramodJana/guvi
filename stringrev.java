import java.util.*;
import java.io.*;
class stringrev
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		if(len<100001)
		{
			for(int i=len-1;i>=0;i--)
			{
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
	}
}
