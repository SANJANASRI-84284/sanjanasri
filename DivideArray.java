package Guvi;
import java.util.*;
public class DivideArray 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=s.nextInt();
	int[] a=new int[n];
	
	int s1=0,s2=0;
	int l=a.length/2;
	int c=0;
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<=l;i++)
	{
		s1+=a[i];
		c++;
	}
	int avg1=s1/c;
c=0;
for(int i=l+1;i<n;i++)
	{
		s2+=a[i];
		c++;
	}
	int avg2=s2/c;
	if(avg1==avg2)
	{
		System.out.println("POSSIBLE");
	}
	else
	{
		System.out.println("NOT POSSIBLE");
	}

}
}
