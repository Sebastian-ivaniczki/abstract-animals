package org.animals.java;

public abstract class Animal {
	private String name;
	private String animalCall;
	private String alimentation;
	private boolean sleep;
	
	

	public boolean isSleep() {
		return sleep;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public Animal(String name, String animalCall,String alimentation, boolean sleep) {
		
		setName(name);
		setAnimalCall(animalCall);
		setSleep(sleep);
		setAlimentation(alimentation);
	}
	
	public abstract String call();
	public abstract String eat();
	public abstract String sleap();
	
	public String getAlimentation() {
		return alimentation;
	}

	public void setAlimentation(String alimentation) {
		this.alimentation = alimentation;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalCall() {
		return animalCall;
	}

	public void setAnimalCall(String animalCall) {
		this.animalCall = animalCall;
	}
	
}
