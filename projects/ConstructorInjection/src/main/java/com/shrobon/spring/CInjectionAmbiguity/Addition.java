package com.shrobon.spring.CInjectionAmbiguity;

public class Addition {
	
/*	public Addition(double a,double b){
		System.out.println("Inside constructor DOUBLE");
	}
	
	public Addition(int a,int b){
		System.out.println("Inside constructor INT");
	}
	
	public Addition(String a,String b){
		System.out.println("Inside constructor STRING");
	}*/
	
	public Addition(int a, double b){
		System.out.println("Inside the Constructor");
	}

}
