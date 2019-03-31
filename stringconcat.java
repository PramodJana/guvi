import java.io.*;
import java.util.*;
class stringconcat
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.next();
		String str1=kb.next();
		if(str.length()<1001&&str1.length()<1001)
		System.out.println(str+str1);
	}
}
