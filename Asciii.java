package Guvi;
import java.util.*;
public class Asciii
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		char c = s.next().charAt(0);
		if(c>='a'&& c<='z')
		{
		int ascii=(int)c-96;
		System.out.println(ascii);
		}
		else
		{
			if(c>='A'&& c<='Z')
		
		{
				int ascii=(int)c-64;
				System.out.println(ascii);
		}
		}
	}
}
