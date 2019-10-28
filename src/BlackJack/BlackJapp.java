package BlackJack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

import Persons.Person;

public class BlackJapp {

	public static void main(String[] args) {
		
		int playerAmount = 0 ;
		System.out.println("How Many Player?");
		Scanner scanner = new Scanner(System.in);
		try
		{
		System.out.println("How Many Player?");
		playerAmount = scanner.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Not an integer, crashing down");
		}
		scanner.close();
		List<Player> playerList = new ArrayList<Player>();
		for(int i = 0 ; i <= playerAmount; i++)
		{
			playerList.add(new Player());
		}
		
		boolean play = true;
		while(play)
		{
			 Player minByPoint = playerList
				      .stream()
				      .min(Comparator.comparing(Player::GetPoints))
				      .orElseThrow(NoSuchElementException::new);
			 
			 

		}
	}

}
