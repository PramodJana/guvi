import java.util.*;
import java.io.*;
class encode3
{
	public static void main(String [] args)
	{
		Scanner kb= new Scanner(System.in);
		String str=kb.next();
		int len=str.length();
		if(len>0&&len<100001)
		{
			for(int i=0;i<len;i++)
			{
				char ch=str.charAt(i);
				if(ch=='X')
				System.out.print('A');
				else if(ch=='Y')
				System.out.print('B');
				else if(ch=='Z')
				System.out.print('C');
				else
				{
					int chi=(int)ch;
					chi+=3;
					System.out.print((char)chi);
				}
			}
			System.out.println();
		}
	}
}
