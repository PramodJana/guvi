import java.io.*;
import java.util.*;
class leastoccur
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String stre=kb.nextLine();String str=stre.toLowerCase();
		int len=str.length();
		if(len>0&&len<100001)
		{
			LinkedHashSet<String> set=new LinkedHashSet<String>();
			for(int i=0;i<len;i++)
			{
				String st=Character.toString(str.charAt(i));
				set.add(st);
			}
			int min=len;
			Iterator<String> itr=set.iterator();
			{
				while(itr.hasNext())
				{
					int count=nocount(str,itr.next());
					if(count<min)
					min=count;
				}
			}
						
			Iterator<String> it=set.iterator();
			{
				while(it.hasNext())
				{	String ss=it.next();
					int con=nocount(str,ss);
					if(con==min&&(!(ss.equals(" "))))
					System.out.print(ss+" ");
				}
				System.out.println();
			}

		}
	}


	public static int nocount(String str,String st)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			String ste=Character.toString(str.charAt(i));
			if(ste.equals(st))
			count++;
		}
		return count;
	}
}
