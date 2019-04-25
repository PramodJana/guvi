import java.io.*;
import java.util.*;
class permutation
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		int len=str.length();
		if(len>0&&len<100001)
		{
			char ch[]=new char[len];
			for(int i=0;i<len;i++)
			{	
				ch[i]=str.charAt(i);
			}
			HashSet<String> set=new HashSet<String>();
			for(int j=0;j<len;j++)
			{
				String res=clock(ch,j);
				set.add(res);
			}
			for(int k=len-1;k>=0;k--)
			{
				String re=anticlock(ch,k);
				set.add(re);
			}
			Iterator<String> itr=set.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
	
	public static String clock(char ch[],int key)
	{
		String str="";
		int len=ch.length;
		for(int i=key;i<len;i++)
		{
			str+=Character.toString(ch[i]);
		}
		for(int j=0;j<key;j++)
		{
			str+=Character.toString(ch[j]);
		}
		return str;
	}

	public static String anticlock(char ch[],int key)
	{	String str="";
		int len=ch.length;
		for(int i=key;i>=0;i--)
		{
			str+=Character.toString(ch[i]);
		}
		for(int j=len-1;j>key;j--)
		{
			str+=Character.toString(ch[j]);
		}
		return str;
	}
}
