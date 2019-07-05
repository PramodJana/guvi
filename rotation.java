import java.io.*;
import java.util.*;
class rotation
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=kb.nextLine();
		int len=str.length();
		char arr[]= new char[len];
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			arr[i]=ch;
		}
		System.out.println("Enter the rotation limit");
		int rotation=kb.nextInt();
		while(rotation!=0)
		{
			char temp=str.charAt(len-1);
			for(int i=len-2;i>=0;i--)
			{
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
			rotation--;
		}
		for(int j=0;j<len;j++)
		{
			System.out.print(arr[j]);
		}
		System.out.println();
	}
}
