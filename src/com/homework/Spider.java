package com.homework;

import java.util.Date;

public class Spider extends Animal {

	public Spider() {
		super(8);
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
System.out.println("蜘蛛吃蜻蜓");
	}
	public static void main(String[] args) {

		 Date d1 = new Date();
	        System.out.println("当前时间:");
	        System.out.println(d1);
	        System.out.println();
	        // 从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
	        Date d2 = new Date(5000);
	        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
	        System.out.println(d2);
	}

}
