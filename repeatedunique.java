import java.util.*;
import java.io.*;
class repeatedunique
{
	public static void main(String [] args)
	{
		Scanner kb= new Scanner(System.in);
		int n=kb.nextInt();
		if((n>0)&&(n<100001))
		{	int flag=0;
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=kb.nextInt();
			}
			int check[]=new int[100000];
			for(int j=0;j<100000;j++)
			{
				check[j]=0;
			}
			for(int k=0;k<n;k++)
			{
				check[a[k]]+=1;
			}
			for(int m=0;m<100000;m++)
			{
				if(check[m]>1)
				{	flag=1;
					System.out.print(check[m]+" ");
				}
			}
			if(flag==0)
				{
					System.out.print("unique");
				}
		}
		System.out.println();
	}
}
