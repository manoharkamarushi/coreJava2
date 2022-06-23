package com.practise.java;

public class Singleton {

	// rule 1. Declare a constructor of type private, so that no one can
	// instantiate outside the class.
	private Singleton() {
		System.out.println("Object created.");
	}

	// rule 2. Declare a static variable with reference of Class.so that it be
	// available globally.
	public static Singleton instanceOfSingletonClass = null;

	// rule 3. Declare a static method of return type class object, which should
	// check if class is already instantiated.
	public static Singleton getInstanceOfSingletonClass() {

		if (instanceOfSingletonClass == null)
			instanceOfSingletonClass = new Singleton();

		return instanceOfSingletonClass;
	}

}
