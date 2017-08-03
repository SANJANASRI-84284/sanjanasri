package Guvi;
import java.util.*;
public class IndexEquals
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the sze of the array");
	int n=s.nextInt();
	int[] a=new int[n];
	System.out.println("The elements in the array are");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}

	for(int i=0;i<n;i++)
	{
		if(a[i]==i)
		{
			System.out.println(a[i]);
		}
	}
	s.close();
}
}
