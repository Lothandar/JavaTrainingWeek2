package Garage;

abstract class Vehicle {
	private int ID;

	private int noOfWheels;
	private int noOfMaxPassengers;
	private int noOfDoors;
	private String brand;
	private int price;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public int getNoOfMaxPassengers() {
		return noOfMaxPassengers;
	}
	public void setNoOfMaxPassengers(int noOfMaxPassengers) {
		this.noOfMaxPassengers = noOfMaxPassengers;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
