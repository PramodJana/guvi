import java.io.*;
import java.util.*;
class average
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int size=kb.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=kb.nextInt();
		}
		int sum=0;
		for(int j=0;j<size;j++)
		{
			sum+=a[j];
		}
		System.out.println((int)sum/size);
	}
}
