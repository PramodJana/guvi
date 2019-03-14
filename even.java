import java.util.*;
import java.io.*;
class Example
{
public static void main(String [] args)
{
  Scanner kb = new Scanner(System.in);
  int n=kb.nextInt();
  if(n<0)
  {
    System.out.println("invalid");
   }
   else
   {
    if(n%2==0)
    {
      System.out.println("Even');
    }
    else
    {
      System.out.println("Odd");
    }
  }
  }
  
