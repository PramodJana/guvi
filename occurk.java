import java.io.*;
import java.util.*;
class occurk
{
	public static void main(String[] args)
	{
		Scanner kb =new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		if(n>0&&n<100001&&k>=0&&k<10)
		{
			String str= Integer.toString(n);
			String st=Integer.toString(k);
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==st.charAt(0))
				count++;
			}
			System.out.println(count);
		}
	}
}
