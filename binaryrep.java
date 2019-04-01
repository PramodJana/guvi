import java.io.*;
import java.util.*;
class binaryrep
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		int flag=0;
		for(int i=0;i<str.length();i++)
		{	
			if(str.charAt(i)!='1'&&str.charAt(i)!='0')
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
