package com.practise.java;

public class PassByValueOrCallByValue {

	public static void main(String[] args) {

		PassByValueOrCallByValue obj = new PassByValueOrCallByValue();
		int ans = obj.sum(10, 20); // call by value or pass by value

		System.out.println(ans);

	}

	public int sum(int x, int y) {
		x = 40;
		y = 60;
		return x + y;

	}

}
