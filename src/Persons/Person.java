package Persons;

public class Person {
	
	String name;
	int age;
	String jobTitle;
	
	public Person(String name, int age, String jobTitle)
	{
		this.name=name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() 
	{
		Integer.toString(age);
		return String.format("%s; %s; %s", name, Integer.toString(age), jobTitle);
	}
	
	public String GetName() 
	{
		return this.name;
	}
}