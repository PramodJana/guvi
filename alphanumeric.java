import java.util.*;
import java.io.*;
class alphanumeric
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		boolean num =false;
		boolean alpha=false;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num=true;
			}
			if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z'))
			{
				alpha=true;
			}
		}	
		if(num==true&&alpha==true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	
}

