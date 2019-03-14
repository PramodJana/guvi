import java.util.*;
import java.io.*;
class oddnum
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner (System.in);
		int m=kb.nextInt();
		int n=kb.nextInt();
		for(int i=m+1;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
	}
}
