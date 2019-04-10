import java.io.*;
import java.util.*;
class thirdchar
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		if(len>0&&len<100001)
		{
			for(int i=0;i<len;i++)
			{
				if(i%3==0)
				{
					System.out.print(str.charAt(i));
				}
			}
		}
		System.out.println();
	}
}
