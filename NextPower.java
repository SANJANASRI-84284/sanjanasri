package Guvi;
import java.util.*;
public class NextPower 
{
public static void main(String[] args)
{Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0;
int sum=0;
int temp=n;

while(temp!=0)
{
	int i=temp%10;
	sum=sum+(int) Math.pow(i,c);
	temp=temp/10;
	c=i;
}

System.out.println(sum);
}

}