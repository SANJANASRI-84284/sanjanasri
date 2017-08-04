package Guvi;
import java.util.*;
public class FirstElementRepeated 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=s.nextInt();
	int[] a=new int[n];
	int c=0;
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		
	}
	for(int i=0;i<n;i++)
			{
		for(int j=i+1;j<n;j++)
		{
			if(c==1)
			
				continue;
			
			if(a[i]==a[j])
			{
				c=1;
		System.out.println(a[i]);
				break;
			
				
			}
		}
			}
}
}
