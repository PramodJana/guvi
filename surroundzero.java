import java.io.*;
import java.util.*;
class surroundzero
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		if(n>0&&n<1001)
		{
			int a[][]=new int[n][n];
			for(int x=0;x<n;x++)
			{
				for(int y=0;y<n;y++)
				{
					a[x][y]=kb.nextInt();
				}
			}
			int arr[][]=new int[n+2][n+2];
			for(int ab=0;ab<n+2;ab++)
			{	int zz=n+1;
				for(int b=0;b<n+2;b++)
				{
					if((ab==0)||(b==0)||(ab==(n+1))||(b==(n+1)))
					{
						arr[ab][b]=0;
					}
					else
					{
						arr[ab][b]=a[ab-1][b-1];
					}
				}
			}
			int count=0;
			for(int i=1;i<n+1;i++)
			{	
				for(int j=1;j<n+1;j++)
				{	if(arr[i][j]==1)
					{int sum=arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+
						arr[i][j-1]+arr[i][j+1]+arr[i+1][j-1]+
						arr[i+1][j]+arr[i+1][j+1];
					if(sum==0)
					{
						count++;
					}
					}


					
				}
			}
			System.out.println(count);
		}
	}
}
