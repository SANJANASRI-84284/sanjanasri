package Guvi;
import java.util.*;
public class ReverseOrderString 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=s.nextLine();
	String[] a=str.split(" ");
	for(int i=0;i<a.length;i++)
	{
		StringBuffer str1=new StringBuffer(a[i]);
		System.out.print(str1.reverse().toString()+" ");
	}
	s.close();
	
}
}
