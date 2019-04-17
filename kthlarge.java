import java.io.*;
import java.util.*;
class kthlarge
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		if((k<=n)&&(n>0&&n<100001))
		{
			int arr[]= new int[n];
			for(int a=0;a<n;a++)
			{
				arr[a]=kb.nextInt();
			}
			 for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] < arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
			System.out.println(arr[k-1]);
		}
	}
}
