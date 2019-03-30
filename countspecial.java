import java.io.*;
import java.util.*;
class countspecial
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		int count=0;
		if(str.length()<1001)
		{
		for(int i=0;i<str.length();i++)
		{	char z=str.charAt(i);
			if(z>='0'&&z<='9')
			{}
			else if(z>='a'&&z<='z')
			{}
			else if(z>='A'&&z<='Z')
			{}
			else
			{count++;}
		}
		System.out.println(count);
	}}
}
