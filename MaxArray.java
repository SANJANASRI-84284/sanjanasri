package Guvi;
import java.util.*;
public class MaxArray 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int max=0;
	int[] arr=new int[25];
	for(int i=0;i<25;i++)
		
	{	arr[i]=s.nextInt();	
	}
	max=arr[0];
	for(int i=0;i<5;i++)
	{
		if(max<arr[i])
		{
			max=arr[i];
		}
	}
	System.out.println(max);
	
}
}
