import java.util.*;
import java.io.*;
class sumk
{
	public static void main(String[] agrs)
	{
		Scanner kb= new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=kb.nextInt();
		}
		int sum=0;
		for(int j=0;j<k;j++)
		{
			sum+=a[j];
		}
		System.out.println(sum);
	}
}		
