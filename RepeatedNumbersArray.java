package Guvi;
import java.util.*;
public class RepeatedNumbersArray
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of elements in the array");
	int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements in the Array");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	
	for(int i=0;i<=a.length;i++)
	{
		if(a[i]==a[i+1])
		{
			System.out.println(a[i]);
		}
	}

	
}
}
