import java.io.*;
import java.util.*;
class firdtk
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		int n=kb.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(str.charAt(i));
		}
	}
}
