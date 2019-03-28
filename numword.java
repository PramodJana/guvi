import java.util.*;
import java.io.*;
class numword
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		int count=0;
		if(len<=1000){
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count+1);
	}}
}
