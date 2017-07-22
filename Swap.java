package Guvi;
import java.util.*;
public class Swap 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	a=Math.abs(a+b);
	b=Math.abs(a-b);
	a=Math.abs(a-b);
	System.out.println(a+" "+b);
}
}
