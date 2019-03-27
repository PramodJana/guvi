import java.math.*;
import java.util.*;
import java.io.*;
class hourdiff
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int time1[]=new int[2];
		int time2[]=new int[2];
		time1[0]=kb.nextInt();
		time1[1]=kb.nextInt();
		time2[0]=kb.nextInt();
		time2[1]=kb.nextInt();
		System.out.println((Math.abs(time1[0]-time2[0]))+" "+(Math.abs(time1[1]-time2[1])));
	}
}
