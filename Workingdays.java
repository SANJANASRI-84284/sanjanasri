package GUVI;
import java.util.*;
public class Workingdays
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String day=s.next();
	if(day.equalsIgnoreCase("sunday"))
	System.out.println("false");
	else
		System.out.println("true");
s.close();
	
}
}
