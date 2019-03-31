import java.io.*;
import java.util.*;
class printstring
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		String str=kb.next();
		int k=kb.nextInt();
		for(int i=0;i<k;i++)
		{
			System.out.println(str);
		}
	}
}
