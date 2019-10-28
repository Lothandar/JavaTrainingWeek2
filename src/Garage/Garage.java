package Garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicle> population = new ArrayList<Vehicle>();
	
	public int VehiclePrice(Vehicle v)
	{
		return v.getPrice();
	}
	
	private int OverallPrice() {
		int total = 0;
		for(Vehicle v : population)
		{
			total += v.getPrice();
		}
		return total;
	}
	
	public void add(Vehicle something) {
		population.add(something);
	}
	public void remove(int ID) {
		
	}
	public void remove(String Type) {
		
	}
	
	public void fixAll() {
		System.out.println(OverallPrice()); 
		population.clear();
	}

	public List<Vehicle> getPopulation() {
		return population;
	}

	public void setPopulation(List<Vehicle> population) {
		this.population = population;
	}
}
