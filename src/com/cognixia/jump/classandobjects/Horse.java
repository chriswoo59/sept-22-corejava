package com.cognixia.jump.classandobjects;

public class Horse extends Animal {

	public Horse(){
		super();
	}
	
	public Horse(String type, double weight){
		super(type, weight);
	}
	
	//method overriding
	// need inheritence, and the exact same method signature from the parent
	// the @Override is NOT required for overriding, but is helpful
	// is runtime polymorphism
//	@Override
//	public void makeSound(String sound) {
//		
//		System.out.println("Horse is from Anmimal.");
//		System.out.println("This horse of type " + super.type + " makes a " + sound + " sound.");
//	}
	
	//method overloading
	// is simply having a method with the the same name, but changing the paramater set, 
	// and/or the return type
	// compile time polymorphism
	public void makeSound(String sound, int volume) {
		System.out.println("Horse volume " + volume + "db making a " + sound + " sound.");
	}
	// also method overloading
	public String makeSound() {
		return "Hosre sound";
	}
}
