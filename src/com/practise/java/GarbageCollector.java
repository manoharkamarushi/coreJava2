package com.practise.java;

public class GarbageCollector {

	public void finalize(){
		
		System.out.println("finalize block");
	}
	public static void main(String[] args){
		
		GarbageCollector g1=new GarbageCollector();
		GarbageCollector g2=new GarbageCollector();
		
		g1=null;
//		g2=null;
		
		System.gc();
		
//		or 
//		Runtime.getRuntime().gc();
		
		// gc() calls the JVM to cleanup the unused m.y space,garbage all the methods which has unused refernce.
	}
}
