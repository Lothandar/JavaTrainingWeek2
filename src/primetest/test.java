package primetest;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		      for (int i = 1; i <= 3000000; i++) {  
		           if (isPrime(i)) {  
		               System.out.println(i);  
		               total +=1;
		           }  
		       }  
		      System.out.println(total);
		   }  
		   public static boolean isPrime(int n) {  
		       if (n <= 1) {  
		           return false;  
		       }  
		       for (int i = 2; i <= Math.sqrt(n); i++) {  
		           if (n % i == 0) {  
		               return false;  
		           }  
		       }  
		       return true;  
		   }  
		   

	}
