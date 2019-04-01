import java.util.*;
import java.io.*;
class vowel1
{
  public static void main(String [] args)
  {
    Scanner kb = new Scanner(System.in);
    String str=kb.next();
	int flag=0;
	for(int i=0;i<str.length();i++)
	{char ch= str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
          ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          {
            flag=1;break;
          }
        }
	if(flag==1)
	System.out.println("yes");
	else
	System.out.println("no");
  }
}
  
