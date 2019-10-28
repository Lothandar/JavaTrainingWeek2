package PaintWizard;

public class Paint {
	private int noOfLitre;
	private double price;
	
	public Paint(String brand, double price, int noOfLitre, int meterSquaredPerLitre) {
		super();
		this.price = price;
		this.noOfLitre = noOfLitre;
		this.meterSquaredPerLitre = meterSquaredPerLitre;
		this.brand = brand;
	}
	private int meterSquaredPerLitre;
	private String brand;
	
	public int getNoOfLitre() {
		return noOfLitre;
	}
	public void setNoOfLitre(int noOfLitre) {
		this.noOfLitre = noOfLitre;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMeterSquaredPerLitre() {
		return meterSquaredPerLitre;
	}
	public void setMeterSquaredPerLitre(int meterSquaredPerLitre) {
		this.meterSquaredPerLitre = meterSquaredPerLitre;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getTotal()
	{
		return meterSquaredPerLitre * noOfLitre;
	}
}
