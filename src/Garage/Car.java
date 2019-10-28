package Garage;

import inheritance.Dolphin;

public class Car extends Vehicle{
	private Dolphin driver = new Dolphin();
	
	
	public Dolphin getDriver() {
		return driver;
	}

	public void setDriver(Dolphin driver) {
		this.driver = driver;
	}
}
