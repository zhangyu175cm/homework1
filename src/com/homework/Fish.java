package com.homework;

import inters.Pet;

public class Fish extends Animal implements Pet {
	private String name;

	public Fish() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"��");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���ˮ");
	}
	public void walk(){
		System.out.println("�㲻����·");
	}

}
