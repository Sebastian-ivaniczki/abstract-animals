package org.animals.java;

public class Main {
	public static void main(String[] args) {
		Dog d1 = new Dog("cane", "bau", "omnivoro", false, "canis canis");
		Bird b1 = new Bird("uccellino", "cip cip", "omnivoro", true, 5);
		Dolphin de1  = new Dolphin("delfino", "aaaaa", "pesce", false, "mammifero");
		Eagle e1 = new Eagle("aquila", "fiuu", "carnivoro", true, 6);
		
		
		Animal[] ani = { d1, b1, de1, e1 };
		String call= null;
		String sleep = null;
		String eat = null;
		for(int i =0; i<ani.length;i++) {
			Animal animal = ani[i];
			
			 call = animal.call();
			 sleep = animal.sleap();
			 eat = animal.eat();
			 
			 System.out.println(call+ sleep + eat);
			 System.out.println("-------------------------------");
		}
		System.out.println("-------------------------------");
		AnimaleManager.faiVolare(b1);
		AnimaleManager.faiVolare(e1);
		AnimaleManager.faiNuotare(de1);
		AnimaleManager.faiNuotare(d1);
	
	}
}
