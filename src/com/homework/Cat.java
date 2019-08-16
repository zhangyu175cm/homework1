package com.homework;

import inters.Pet;

public class Cat extends Animal implements Pet {
	public String name;
	
	public Cat(){
		super(4);
	}
	public Cat(String name) {
		super(4);
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"³Ô");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"Íæ");
	}

}
