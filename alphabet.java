import java.util.*;
import java.io.*;
class alphabet
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		char ch=kb.nextLine().charAt(0);
		if ((ch>64&&ch<91)||(ch>96&&ch<123))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("No");
		}
	}
}
