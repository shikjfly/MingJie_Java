package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Rabbit {
	public int money; // 没有static，每个对象都有一个自己的money属性
	public static String food;
	public Rabbit(int money, String food) {
		this.money = money;
		Rabbit.food = food;
	}
	static public void getTime() {
		//获取当前的毫秒时间
		Date nowTime = new Date(System.currentTimeMillis());
		//格式化工具，把时间设置成yyyy-MM-dd的格式年月日
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd H:m");
		//把前面两个结合一下
		String timeStr = sf.format(nowTime);
		System.out.println("当前时间："+timeStr);		
	}
	
	public static void main(String[] args) {
		Rabbit r1 = new Rabbit(30,"萝卜");
		System.out.println(r1.money+Rabbit.food);
		Rabbit.getTime();
		
		Rabbit r2 = new Rabbit(2220,"土豆");
		System.out.println(r2.money+Rabbit.food);
		
		//food由之前的萝卜改成共用土豆了，r1
		System.out.println(r1.money+r1.food);
		
		
	}
}
