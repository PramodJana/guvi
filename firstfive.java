import java.util.*;
import java.io.*;
class firstfive
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		for(int i=1;i<6;i++)
		{
			System.out.print((num*i)+" ");
		}
		System.out.println();
	}
}
