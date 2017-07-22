package Guvi;
import java.util.*;
public class SquareStar 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of lines to print");
	int m=s.nextInt();
char[][] ch=new char[m][m];
for(int i=0;i<1;i++)
	{
		for(int j=0;j<m;j++)
		{
			ch[i][j]='*';
		    System.out.print(ch[i][j]+"  ");

		}
		System.out.println("\n");

	}
for(int i=1;i<=m-2;i++)
{
	for(int j=0;j<=m-1;j++)
	{
		if(j==0 || j==(m-1))
		{
			ch[i][j]='*';
		    System.out.print(ch[i][j]+"  ");

		}
		else
		{
			ch[i][j]=' ';
		    System.out.print(ch[i][j]+"  ");

		}
	}
	System.out.println("\n");

	
}
for(int i=m-1;i<=m-1;i++)
{
	for(int j=0;j<m;j++)
	{
		ch[i][j]='*';
	    System.out.print(ch[i][j]+"  ");

    }
	System.out.println("\n");

}
}
}