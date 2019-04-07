import java.io.*;
import java.util.*;
class differk
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str1=kb.next();
		String str2=kb.next();
		int in=kb.nextInt();
		if(str1.length()<100001)
		{	int count=0;
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!=str2.charAt(i))
				{
					count++;
				}
			}
			if(count==in)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}
