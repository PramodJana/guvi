import java.io.*;
import java.util.*;
class power2again
{
	public static void main(String[] args)
	{
		Scanner kb= new Scanner(System.in);
		int num=kb.nextInt();
		int i=1;boolean flag=false;
		if(num>0&&num<100001){
		while(i<=num)
		{
			if(i==num)
			{
				flag=true;break;
			}
			else
			{
				i=i*2;
			}
		}
		if(flag==true)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
}
