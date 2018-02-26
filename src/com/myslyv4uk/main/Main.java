package com.myslyv4uk.main;

import com.myslyv4uk.polymorfism.Parent;
import com.myslyv4uk.polymorfism.ParentClass;
import com.myslyv4uk.polymorfism.Polymorfism;

public class Main {
	
	enum Status{
		SEND ("accepted"), REJECTED("declined");
		private String status; 
		private Status(String status){
			this.status = status;
		}
		
		public void printExpectedVisitors() {
			 System.out.println(status);
		}
		
	}
	
	public static void main(String[] args) {
//		for(String a : args) {
//			System.out.println(a);
//		}
		
		
		int[] age25 = new int[25];
		int[] age30 = new int[30];
		
		getStudentsAges(age25);
		getStudentsAges(age30);
		
		Polymorfism poly = new Polymorfism();
		poly.tranfsformObject();
		poly.getSomething();
		poly.init();
		Parent poly1 = new Polymorfism();
		poly1.getSomething();
		
		
		ParentClass classParent = new Polymorfism();
		classParent.init();
		Polymorfism polyCast = (Polymorfism) classParent;
		Status.SEND.printExpectedVisitors();
	
		
	}
	
	public static void getStudentsAges(int... age) {
		
	}
	
}
