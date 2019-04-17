import java.io.*;
import java.util.*;
class substring
{
	public static void main(String [] args)
	{
		Scanner kb= new Scanner(System.in);
		String str=kb.next();
		int len=str.length();
		if(len>0&&len<100001)
		{
			String st=kb.next();
			int le=st.length();
			boolean flag=false;
			for(int i=0;i<len-le+1;i++)
			{
				flag=check(str.substring(i,i+le),st);
				if(flag==true)
				break;
			}
			if(flag==true)
			System.out.println("yes");
			else
			System.out.println("no");
		}
	}


	public static boolean check(String str,String st)
	{	
		int len=str.length();
		boolean result=true;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)!=st.charAt(i))
			result=false;
		}
		return result;
	}
}
