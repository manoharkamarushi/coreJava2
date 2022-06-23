package com.practise.java;

public class TInstantiateSingleClassExample {
	// A normal class where we will try to instantiate class
	// SingletonClassExample

	public static void main(String[] args) {

		Singleton x = Singleton.getInstanceOfSingletonClass();
		Singleton y = Singleton.getInstanceOfSingletonClass();
		// printed only once
		// It will not create object of class again if already initialized once.
	}

}
