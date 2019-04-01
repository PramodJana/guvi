import java.io.*;
import java.util.*;
class reversevowel
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int n=kb.nextInt();
		if(n>0&&n<100001)
		{
			String str=kb.next();
			for(int i=n-1;i>=0;i--)
			{
				char ch=str.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
				}
				else
				{
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}
