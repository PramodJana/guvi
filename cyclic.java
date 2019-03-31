import java.io.*;
import java.util.*;
class cyclic
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int size=kb.nextInt();
		int a[]=new int[size+1];
		int shift=kb.nextInt();
		if(size>0&&shift>0&&size<100001&&shift<100001)
		{	
			for(int i=0;i<size;i++)
			{
				a[i]=kb.nextInt();
			}
			while(shift!=0)
			{
				for(int j=size-1;j>=0;j--)
				{
					a[j+1]=a[j];
				}
				a[0]=a[size];
				shift--;
			}
			for(int k=0;k<size;k++)
			System.out.print(a[k]+" ");
		
		}
	}
}
