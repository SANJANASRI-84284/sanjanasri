package Guvi;
import java.util.*;

public class LeapyearAfter20 {


public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the year ");
	int n=s.nextInt();
	if(n%4==0 || n%100==0)
	{
		for(int i=n+4;i<=n+80;i++)
		{
			if(i%4==0 || i%100==0)
			{
				System.out.println(i);
			}
		}
	}
}
}