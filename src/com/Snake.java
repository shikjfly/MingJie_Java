package com;

public class Snake implements IFire {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age<10)  this.age = 10;
		else if (age>20)  this.age = 20;
		else if (age<=20 || age>=10)  this.age = age;
	}
	
	
	public int length; //长度
	public int level; //等级
	public String name; //昵称
	public Boolean isFire; //是否吐火技能
	//攻击技能
	public void attack() {
		System.out.println("吐火");
	}
	//添加说出名字的方法
	public void sayName() {
		System.out.println("我的名字叫"+name);
	}
	public void saniao() {
		this.fire();
	}
	//添加吐火的能力
	public void fire() {
		System.out.println("Snake1在吐火");
	}
	//默认构造函数样式
	public Snake() {
		//如果没有赋值，系统默认创建的构造函数
		setAge(0);
		length = 0;
		level = 0;
		name = "";
		isFire = false;
	}
	//构造函数2
	public Snake(int age, int length, int level, String name, Boolean isFire) {
		this.setAge(age);
		this.length = length;
		this.level = level;
		this.name = name;
		this.isFire = isFire;
	}

}
