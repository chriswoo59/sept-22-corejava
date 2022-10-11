package com.cognixia.jump.classandobjects;

public class Vehicle {
	
	// attributes
	private String classType;
	private double numAxles;
	// This is composition!
	private Engine engine;
	
	// constructors
	public Vehicle() {
		this.classType = "C";
		this.numAxles = 2;
		this.engine = new Engine();

	}
	
	// methods
	// getters and setters
	public String getClassType() {
		return this.classType;
	}
	
	public void setClassType(String classType) {
		this.classType = classType;
	}

	public double getNumAxles() {
		return numAxles;
	}

	public void setNumAxles(double numAxles) {
		this.numAxles = numAxles;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		Engine input = engine;
		if(input == null) {
			input = new Engine();
		}
		this.engine = input;
	}

	@Override
	public String toString() {
		return "Vehicle [classType=" + classType + ", numAxles=" + numAxles + ", engine=" + engine + "]";
	}
	
}
