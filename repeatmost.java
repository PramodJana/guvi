import java.io.*;
import java.util.*;
class repeatmost
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		if((len>0)&&(len<100001))
		{
			int max=0;
			char res=str.charAt(0);
			for(int i=0;i<len;i++)
			{
				int flag=0;
				for(int j=0;j<i;j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					for(int k=i;k<len;k++)
					{	int count=0;
						for(int l=k+1;l<len;l++)
						{
							if(str.charAt(k)==str.charAt(l))
							{
								count++;
							}
						}
						if(count>max)
						{
							max=count;
							res=str.charAt(k);
						}
					}
					
				}
			}System.out.println(res);
		}
	}
}
