package PrimeNum;

import java.util.ArrayList;
import java.util.List;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(PrimeNo(2, 3000000).size());
		
		int total = 0;
	      for (int i = 1000000; i <= 2000000; i+=2) { 
	    	  if(i%5 != 5)
	    	  {
	    		  if(SplitDigit(i).stream().reduce((a,b) -> a + b).get() % 3 != 0)
	    		  {
	           if (isPrime(i)) {  
	               System.out.println(i);  
	               total +=1;
	           }		
	           }
	    	  }
	       }  
	      System.out.println(total);
	   }  

	/* public static boolean isPrime(int n) {  
    if (n <= 1) {  
        return false;  
    }  

    for(int j = 2; j<= Math.sqrt(n) ; j++)
	{
		if(n % j == 0)
		{
			return false;
		}

	}
    return true;  
}  
	public static List<Integer> PrimeNo(int begin, int end)
	{
		
		
		
		List<Integer> primes = new ArrayList<>();
		int i = 0;
		if(begin%2 == 0)
		{
			i = begin;
		}
		else {
			i=begin + 1;
		}
		
		for(i++ ; i <= end; i+=2)
		{
			//if(i%5 != 5 && i%5!=0)
			//{
				//if(SplitDigit(i).stream().reduce((a,b) -> a + b).get() % 3 != 0)
				//{
				 * 
				 */
			public static boolean isPrime(int i) {  
			    if (i <= 1) {  
			        return false;  
			    }  

					for(int j = 3; j<= Math.sqrt(i) ; j++)
					{
						if(i % j == 0)
						{
							return false;
						}
						//else if(Math.sqrt(i) == j+1)
						//{
							//primes.add(i);
							//System.out.println(i);
						//}
					}
					return true;
				}
			//}
		//}
		//return primes;
	//}
	public static List<Integer> SplitDigit(int i)
	{
		List<Integer> digit = new ArrayList<>();
		while (i > 0) {
		    digit.add( i % 10);
		    i = i / 10;
		}
		return digit;
	}
}
