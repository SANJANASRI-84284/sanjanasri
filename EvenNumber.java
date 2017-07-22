package Guvi;
import java.util.*;
public class EvenNumber 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	if((n&1)==0)
	{
		System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}
	s.close();
}
}
