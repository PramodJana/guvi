import java.io.*;
import java.util.*;
class balanced
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		Stack<String> stack=new Stack<String>();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='(')
			{
				stack.push("(");
			}
			else
			{
				stack.pop();
			}
		}
		Iterator<String> itr=stack.iterator();
		if(itr.hasNext())
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
