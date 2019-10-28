package inheritance;

public abstract class Mammal extends Animal {
	
	private int amountOfHair;
	
	public int getAmountOfHair() {
		return amountOfHair;
	}

	public void setAmountOfHair(int amountOfHair) {
		this.amountOfHair = amountOfHair;
	}

	public void code() {
		System.out.println("click click click tap tap tap code done");
	}
	
	public Mammal() {
		super();
	}
}
