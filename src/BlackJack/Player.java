package BlackJack;

import java.util.Random;
import java.util.Scanner;

public class Player {
	int total= 0;
	boolean inPlay = true;
	
	public int GetPoints() 
	{
		return this.total;
	}
	
	
	public void Stopping()
	{
		System.out.println("Do you want to draw another card");
		Scanner scanner = new Scanner(System.in);
		if(scanner.nextLine() != "Yes")
		{
			this.inPlay= false;
		}
		
		scanner.close();
	}
	public void DrawCard()
	{
		Random r = new Random();
		this.total += r.nextInt(11) + 1;
	}
	
}
