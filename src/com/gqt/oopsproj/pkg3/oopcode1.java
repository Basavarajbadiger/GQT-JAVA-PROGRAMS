package com.gqt.oopsproj.pkg3;
class Dog{
	private String name;
	private int cost;
	private int age;
	private String color;
	private String breed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}


public class oopcode1 {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.setName("Tommy");
		d1.setCost(5000);
		d1.setAge(5);
		d1.setColor("golden");
		d1.setBreed("lab");
      
		
		System.out.println(d1.getName());
		System.out.println(d1.getCost());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		System.out.println(d1.getBreed());
		

	}

}
