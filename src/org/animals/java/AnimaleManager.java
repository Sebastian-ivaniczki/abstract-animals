package org.animals.java;

import interf.Flying;
import interf.Swimming;

public class AnimaleManager {

	public static void faiVolare(Flying animal) {
		animal.fly();
	}
	
	public static void faiNuotare(Swimming animal) {
		animal.swim();
	}
}
