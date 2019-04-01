import java.math.*;
import java.io.*;
import java.util.*;
class digitsquare
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		int result=0;
		if(num>0&&num<1000000000000000001l)
		{
			while(num!=0)
			{
				result+=Math.pow(num%10,2);
				num/=10;
			}
			System.out.println(result);
		}
	}
}
