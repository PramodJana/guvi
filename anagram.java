import java.io.*;
import java.util.*;
class anagram
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		if(num>0&&num<1001)
		{
			String str[]=new String[num];
			for(int i=0;i<num;i++)
			{
				str[i]=kb.next();
			}
			int res=0;
			for(int j=0;j<num;j++)
			{
				int flag=check(str[j]);
				if(flag==1)
				{res++;}
			}
			System.out.println(res);
		}
	}


	public static int check(String str)
	{
		String st="kabali";
		if(str.length()!=st.length())
		{
			return 0;
		}
		else
		{
			char ch1[]=new char[str.length()];
			char ch2[]=new char[str.length()];
			for(int i=0;i<str.length();i++)
			{
				ch1[i]=str.charAt(i);
				ch2[i]=st.charAt(i);
			}
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int flag=1;
			for(int k=0;k<str.length();k++)
			{
				if(ch1[k]!=ch2[k])
				{
					flag=0;
					break;
				}
			}
			return flag;
		}
	}
}
