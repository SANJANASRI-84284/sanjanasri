package GUVI;
import java.util.*;
public class Stringreversevowels {

	public static void main(String[] args) 
	{
	   String str=new String();
	   int c=0;
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the first String ");
	   str=s.next();
	   StringBuffer str1=new StringBuffer(str);
	   str1.reverse();
	   System.out.println("The reversed string is "+str1);
	   for(int i=0;i<=str1.length()-1;i++)
	   {
		   String str2=str1.substring(i,i+1);
		   if((str2.equalsIgnoreCase("a"))|| (str2.equalsIgnoreCase("e"))||(str2.equalsIgnoreCase("i"))||(str2.equalsIgnoreCase("o"))|| (str2.equalsIgnoreCase("u") ))
		   {
			   c++;
		   }
		   else
		   {
			   System.out.print(str1.substring(i,i+1));
		   }
	   }
	}
}