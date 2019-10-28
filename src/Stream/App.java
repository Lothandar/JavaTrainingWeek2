package Stream;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(154);
		list.add(121);
		list.add(641);
		list.add(21);
		list.add(54561);
		list.add(14589);
		list.add(154156);
		list.add(10);
		list.add(5);
		
		
		
		
		System.out.println(Loop.maxValue(list));
		System.out.println(Loop.minValue(list));
		System.out.println(Loop.oddNumber(list));
		System.out.println(Loop.evenNumber(list));
		System.out.println(Loop.sum(list));
		System.out.println(Loop.Square(list));
		System.out.println(Stream.maxValue(list));
		System.out.println(Stream.minValue(list));
		System.out.println(Stream.oddNumber(list));
		System.out.println(Stream.evenNumber(list));
		System.out.println(Stream.sum(list));
		System.out.println(Stream.Square(list));
		
	}

}
