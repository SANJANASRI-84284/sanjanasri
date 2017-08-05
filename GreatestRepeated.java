package Guvi;
import java.util.*;
public class GreatestRepeated 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	String[] a=str.split(" ");
	int max=0;
	String str1="";                                                                    
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length();j++)
		{
			int c=0;
			for(int k=0;k<a[i].length();k++)
			{
				if(a[i].charAt(j)==a[i].charAt(k))
				{
					c++;
				}
			}
			if(max<c)
			{
				str1=a[i];
				max=c;
				
			}
		}
	}
	System.out.println(str1);
}
}
