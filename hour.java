import java.util.*;
import java.io.*;
class hour
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int hou=0;
		if(n<60)
		{
			System.out.println(hou+" "+n);
		}
		else
		{
			while(n>59)
			{
				hou++;
				n=n-60;
			}
			System.out.println(hou+" "+n);
		}
	}
}
