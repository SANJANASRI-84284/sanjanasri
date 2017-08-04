package Guvi;
import java.util.*;
public class Translate
{
public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
    String str=sc.next();
	String str1=str.toLowerCase();
	String s1="";
	 for(int i=0;i<str1.length();i++)
	    {
		    int a1=(int)str1.charAt(i);
		    a1=a1-96;
		    String s=Integer.toString(a1);
		    s1=s1+s;
}System.out.println(s1);
}
}
