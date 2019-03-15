import java.util.*;
import java.io.*;
class commonprefix
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		kb.nextLine();
		if((n>0)&&(n<100001))
		{
			String str[]= new String[n];
			for(int i=0;i<n;i++)
			{
				str[i]=kb.nextLine();
				kb.nextLine();
			}
			for(int j=0;j<n;j++)
			{
				System.out.println(str[j]);
			}
		}
	}
}
