package com.myslyv4uk.polymorfism;

public class ParentClass {
	
	public void init() {
		Status a =	Status.REJECTED;
	}
	
	enum Status{
		SEND ("accepted"), REJECTED("declined");
		Status(String status){
			
		}
		
	}

}
