package Guvi;
import java.util.*;
public class ReverseOddString 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	String[] a=str.split("\\s");

	for(int i=0;i<a.length;i++)
	{
		if(i%2==0)
		{
			StringBuffer str1=new StringBuffer(a[i]);
			a[i]=str1.reverse().toString();
			System.out.print(a[i]+" ");
					
		}
		else
		{
		System.out.print(a[i]+" ");
		}
	}			
}
}
