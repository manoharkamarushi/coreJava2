package com.practise.java;

public class PassByReference {

	int p;
	int q;

	public static void main(String[] args) {

		PassByReference obj = new PassByReference();

		obj.p = 10;
		obj.q = 20;

		int ans=obj.swap(obj);
		
		System.out.println(ans);
	}

	public int swap(PassByReference r) {

		r.p = 30;
		r.q = 40;

		return r.p + r.q;
	}

}