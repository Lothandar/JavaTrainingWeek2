package Persons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Ola", 40, "Manager in a Cheese Factory");
		Person person2 = new Person("Anne Otherone", 20,"unemployed");
		Person person3 = new Person("Anne Onymous",34,"Zoo kepeer");
		
		
		List<Person> list = new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		
		for(Person i: list) {
			System.out.println(i.toString());
		}
		
		LookingForSomeone(list);
		
	}
	public static void LookingForSomeone(List<Person> l1) {
		System.out.println("Who are you looking for?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		scanner.close();
		for(Person i: l1) {
			//System.out.println(i.name +" "+ name);
			if(i.GetName().equalsIgnoreCase(name))
			{
				System.out.println(i.toString());
				
			}
		}
		//System.out.println("No One has been found");
	}
}
