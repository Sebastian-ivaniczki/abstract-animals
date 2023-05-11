package org.animals.java;

import interf.Swimming;

public class Dolphin extends Animal implements Swimming{
private String species;
	
	public Dolphin(String name, String animalCall, String alimentation,boolean sleep ,String species) {
		super(name, animalCall, alimentation, sleep);
		
		setSpecies(species);
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String call() {
		return getName() + " della specie: "+ getSpecies() + " fa: " + getAnimalCall();
	}

	@Override
	public String eat() {
		
		return getName() + " della specie: "+ getSpecies() + " mangia: "+ getAlimentation();
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
		public void swim() {
			System.out.println("Sono " + getName() + ", Sto nuotando");
			
		
		}
}
