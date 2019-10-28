package Stream;

import java.util.ArrayList;
import java.util.List;

public class Loop {
	
	public static int maxValue(List<Integer> list)
	{
		int max = 0;
		for(int i =0; i< list.size() - 2; i++)
		{
			max = Math.max(list.get(i), list.get(i+1));
		}
		return max;
	}
	public static int minValue(List<Integer> list)
	{
		int min = 0;
		for(int i =0; i< list.size() - 2; i++)
		{
			min = Math.min(list.get(i), list.get(i+1));
		}
		return min;
	}
	public static List<Integer> oddNumber(List<Integer> list)
	{
		List<Integer> odd = new ArrayList<>();
		for(int i : list)
		{
			if(i%2 !=0)
			{
				odd.add(i);
			}
		}
		return odd;
	}
	public static List<Integer> evenNumber(List<Integer> list)
	{
		List<Integer> even = new ArrayList<>();
		for(int i : list)
		{
			if(i%2 ==0)
			{
				even.add(i);
			}
		}
		return even;
	}
	public static int sum(List<Integer> list)
	{
		int sum = 0;
		for(int i : list)
		{
			sum+=i;
		}
		return sum;
	}
	public static int Square(List<Integer> list)
	{
		List<Integer> result = new ArrayList<>();
		for(int i : list)
		{
			i*=i;
			if(i %2 != 0)
			{
				result.add(i);
			}
		}
		int min = 0;
		for(int i =0; i< result.size() - 2; i++)
		{
			min = Math.min(result.get(i), result.get(i+1));
		}
		return min;
		
	}
}
