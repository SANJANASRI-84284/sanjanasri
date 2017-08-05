package Guvi;
import java.util.*;
public class SortArray 
{
	public static void main(String[] args)
	{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
int[] b=new int[n];
int c=0;
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
	b[i]=a[i];
	
}
Arrays.sort(a);
for(int i=0;i<n;i++)
{
	if(a[i]==b[i])
	{
		c=0;
	}
	else
	{
		c=1;
	}
}
if(c==0)
{
	

	System.out.println("The value entered by the user is already sorted");
}
else
{
	System.out.println("The value entered by the user is not sorted");
}

}
}