import java.io.*;
import java.util.*;
class player22
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int l=kb.nextInt();
		int r=kb.nextInt();
		if(l>0&&r>0&&l<100001&&l<100001)
		{
			int max=l*r;
			for(int i=max;i>0;i--)
			{	
				if(l%i==0&&r%i==0)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}
