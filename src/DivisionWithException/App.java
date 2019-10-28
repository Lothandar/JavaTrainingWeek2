package DivisionWithException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division();
	}
	public static Scanner scan = new Scanner(System.in);
	public static int input ()
	{
		System.out.println("Enter a number");
		try {
		return Integer.parseInt(scan.nextLine());
		}
		catch (NumberFormatException e)
		{
			return input();
		}
	}
	public static void division()
	{
		try 
		{		
			System.out.println(input()/input());
		}
		catch(ZeroException ze)
		{
			System.out.println(ze.toString());
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
