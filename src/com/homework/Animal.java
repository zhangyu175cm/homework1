package com.homework;

public abstract class Animal {
	protected int legs;

	protected Animal(int legs) {
		super();
		this.legs = legs;
	}

	

	public void walk() {
		System.out.println("��"+this.legs+"������·");
	}

	public abstract void eat();
}
