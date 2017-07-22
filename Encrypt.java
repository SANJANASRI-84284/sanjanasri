package Guvi;
import java.util.*;
import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		char ch[] = str2.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			int a=(int)str1.charAt(i)+10;
			System.out.print((char)a);
		}System.out.print(" ");
		for(int j=1;j<str2.length()-1;j++)
		{
			int b = (int)str2.charAt(j)+10;
			if(b>122)
			{
				b = 122 - b;
				if(b>0)
				{
					b = b + 96;
					
				}
				else
				{
					int temp = b * (-1);
					b = temp + 96;
				}
				ch[j] = (char)b;
			}
			else
			{
				ch[j] = (char)b;
			}
			
		}
		String str3 = new String(ch);
		System.out.print(str3);

	}

}