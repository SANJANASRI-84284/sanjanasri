package Guvi;
import java.util.*;
public class SquareOrNot 
{
	
		public static void main(String args[])
		{
	Scanner in=new Scanner(System.in);
	System.out.println("ente the no");
	int a1=in.nextInt();
	int b1=in.nextInt();
	int a2=in.nextInt();
	int b2=in.nextInt();
	int a3=in.nextInt();
	int b3=in.nextInt();
	int a4 = in.nextInt();
	int b4=in.nextInt();

	if(a1==a3&&a2==a4&&b3==b4&&b1==b2)
	{
		System.out.println("The given values form a square");
	}
	else
	{
		System.out.println("The given values does't form a square");
	}
	}
	}

