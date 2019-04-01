import java.io.*;
import java.util.*;
class factors
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
