import java.util.*;
import java.io.*;
class revnum
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		int num=kb.nextInt();
		int clone=num;
		int rev=0;
		while(clone!=0)
		{
			int temp=clone%10;
			rev=(rev*10)+temp;
			clone/=10;
		}
		System.out.println(rev);
	}
}
