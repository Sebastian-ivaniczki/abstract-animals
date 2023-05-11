package org.animals.java;

import interf.Flying;

public class Bird extends Animal implements Flying{

	private int eggDimension;
	
	public Bird(String name, String animalCall, String alimentation, boolean sleep, int eggDimension) {
		super(name, animalCall, alimentation, sleep);
		setEggDimension(eggDimension);
	}

	public int getEggDimension() {
		return eggDimension;
	}

	public void setEggDimension(int eggDimension) {
		this.eggDimension = eggDimension;
	}
	
	@Override
	public String call() {
		return getName() +  " fa: " + getAnimalCall();
	}

	@Override
	public String eat() {
		
		return getName() +  " mangia: "+ getAlimentation();
	}

	@Override
	public String sleap() {
		if(isSleep()) {
			return "zzzz";
		}else {
			return "l'animale è sveglio";
		}
	}
	
	@Override
	public void fly() {

		System.out.println("Sono " + getName() + ", Sto volando");
		
	}

}
