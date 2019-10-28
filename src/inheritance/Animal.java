package inheritance;

public abstract class Animal {

	private int noOfLimbs;
	private int weight;
	
	public Animal() {
		super();
	}
	
	public abstract void communicate();
	
	public void die() {
		System.out.println();
	}
	
	
	public int getNoOfLimbs() {
		return noOfLimbs;
	}
	public void setNoOfLimbs(int noOfLimbs) {
		this.noOfLimbs = noOfLimbs;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
