package com.homework;

public abstract class Animal {
	protected int legs;

	protected Animal(int legs) {
		super();
		this.legs = legs;
	}

	

	public void walk() {
		System.out.println("用"+this.legs+"条腿走路");
	}

	public abstract void eat();
}
