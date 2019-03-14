import java.util.*;
import java.io.*;
class Example
{
  public static void main(String [] args)
  {
    Scanner kb = new Scanner(System.in);
    char ch=kb,next();
    
      if((ch>64&&ch<96)||(ch>96&&ch<123))
      {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
          ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          {
            System.out.println("Vowel");
          }
          else
          {
            System.out.println("Consonant");
          }
        }
    else
    {
      System.out.println("invalid");
    }
  }
}
  
