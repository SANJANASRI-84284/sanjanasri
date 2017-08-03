package Guvi;
import java.util.*;
public class StrangeCounter
{
	public static void main(String[] args)
	{
Scanner s=new Scanner(System.in);
int t=0;
int count=3;
t=s.nextInt();
while(t>count)
{
	t=t-count;
	count=count*2;
}
System.out.println(count-t+1);

}
}