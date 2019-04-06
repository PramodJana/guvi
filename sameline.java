import java.io.*;
import java.util.*;
class sameline
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int x[]=new int[3];
		int y[]=new int[3];
		for(int i=0;i<3;i++)
		{
			x[i]=kb.nextInt();
			y[i]=kb.nextInt();
		}
		if((x[0]==x[1])&&(x[1]==x[2]))
		{
			System.out.println("yes");
		}
		else
		{
			if((y[0]==y[1])&&(y[1]==y[2]))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}
