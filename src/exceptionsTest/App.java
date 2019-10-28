package exceptionsTest;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			baguette();
		}
		catch(OutOfBaguetteException oobe)
		{
			System.out.println("Fetch ze guillotine!");
		}
		System.out.println("test");
	}
	
	public static void baguette()
	{
		throw new OutOfBaguetteException();
	}

}
