import java.io.*;
import java.util.*;
class differone
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str1=kb.next();
		String str2=kb.next();
		if(str1.length()<100001)
		{	int count=0;
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!=str2.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
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
