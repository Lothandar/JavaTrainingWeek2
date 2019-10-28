package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static int maxValue(List<Integer> list)
	{
		return list.stream().reduce((a,b) -> Math.max(a, b)).get();
	}
	public static int minValue(List<Integer> list)
	{
		return list.stream().reduce((a,b) -> Math.min(a, b)).get();
	}
	public static List<Integer> oddNumber(List<Integer> list)
	{
		return list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
	}
	public static List<Integer> evenNumber(List<Integer> list)
	{
		return list.stream().filter(x -> x%2 != 0).collect(Collectors.toList());
	}
	public static int sum(List<Integer> list)
	{
		return list.stream().reduce((a,b) -> a+b).get();
	}
	public static int Square(List<Integer> list)
	{
		return list.stream().map(x -> x*x).filter(x -> x%2 == 0).reduce((a,b) -> Math.min(a, b)).get();
	}
}
