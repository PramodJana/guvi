import java.io.*;
import java.util.*;
class binaryserch
{
	public static int binarySearch(int[] A, int x)
	{
		int left = 0, right = A.length - 1;

		while (left <= right)
		{
			int mid = (left + right) / 2;
			if (x == A[mid]) {
				return mid;
			}
			else if (x < A[mid]) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		if(n>0&&n<1000000000000001l)
		{
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		A[i]=kb.nextInt();
		int index = binarySearch(A, k);

		if (index != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
}	}
}
