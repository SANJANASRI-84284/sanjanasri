package Guvi;
import java.util.*;
public class Seed
{
	public static void main(String[] args)
	{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number to chech the number io seed or not");
int x=s.nextInt();
int sum=0;
int t=x;
int seed=x;
while(t>0)
{
	seed=seed*(t%10);
	sum+=(t%10);
	t=t/10;
	
}
x=x*sum;
if(x==seed)
{
	System.out.println("The number is seed");
}
else
{
	System.out.println("The  number is not seed");
}

}
}