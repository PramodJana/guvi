import java.io.*;
import java.util.*;
class multiple13
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		if(num%13==0)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
