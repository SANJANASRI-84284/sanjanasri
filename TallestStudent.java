package Guvi;
import java.util.*;
public class TallestStudent 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	System.out.println("The 4th tallest person is"+a[n-4]);
	System.out.println("Enter the k value to find the kth tallest student");
	int k=s.nextInt();
	System.out.println("the"+k+"tallest student is"+a[k-1]);
}
}
