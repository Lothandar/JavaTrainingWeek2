package reverseString;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		String result = "";
		Scanner scan = new Scanner(System.in);
		try {
			s = scan.nextLine();
		}
		catch(Exception e)
		{
			
		}
		for(int i = s.length() -1; i>=0; i--)
		{
			result +=  s.charAt(i);
		}
		System.out.println(result);
		}
	}

