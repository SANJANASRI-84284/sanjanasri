package Guvi;
import java.util.*;

public class CloseAZero {

	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=s.nextInt();
int[] a=new int[n];
int sum=0;
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
	for(int j=1;j<n;j++)
	{
		sum=a[i]+a[j];
		if(sum==0 || sum==1 || sum==2 || sum==-1 || sum==-2)
		{
			System.out.println(a[i]+" "+a[j]);
		}
	}
}
	}

}
