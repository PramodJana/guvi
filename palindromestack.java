import java.io.*;
import java.util.*;
class palindromestack
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		if(len>0&&len<100001)
		{
			Stack<String> stack = new Stack<String>();
			int len1=0;
			if(len%2==0)
			{	len1=len-1;
			}
			else
			{
				len1=len;
			}
			for(int i=0;i<=len1/2;i++)
			stack.push(Character.toString(str.charAt(i)));

			Stack<String> test=new Stack<String>();
			for(int i=len/2;i<len;i++)
			test.push(Character.toString(str.charAt(i)));
			
			boolean flag=true;
			Iterator<String> teats=stack.iterator();
			while(teats.hasNext())
			{	String st=teats.next();String strr=test.pop();
				if(st.compareTo(strr)==0)
				{	
					
					
				}
				else
				{
					flag=false;break;
				}
			}
			
			if(flag==true)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
