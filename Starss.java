package Guvi;
import java.util.*;
public class Starss {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
		s.close();
	}

}
