package Guvi;
import java.util.Scanner;
public class Unique 
{
	
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=s.nextInt();
int i,j;
int a[]=new int[n];
for(i=0;i<n;i++)
{
 a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
 for(j=0;j<n;j++)
 {
   if(i!=j)
   {
   if(a[i]==a[j])
   {
     break;
   }
   }
 }
 if(j==n)
 {
  System.out.println(a[i]);
  break;
 }
}
}
}

