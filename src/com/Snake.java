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
	
	
	public int length; //����
	public int level; //�ȼ�
	public String name; //�ǳ�
	public Boolean isFire; //�Ƿ��»���
	//��������
	public void attack() {
		System.out.println("�»�");
	}
	//���˵�����ֵķ���
	public void sayName() {
		System.out.println("�ҵ����ֽ�"+name);
	}
	public void saniao() {
		this.fire();
	}
	//����»������
	public void fire() {
		System.out.println("Snake1���»�");
	}
	//Ĭ�Ϲ��캯����ʽ
	public Snake() {
		//���û�и�ֵ��ϵͳĬ�ϴ����Ĺ��캯��
		setAge(0);
		length = 0;
		level = 0;
		name = "";
		isFire = false;
	}
	//���캯��2
	public Snake(int age, int length, int level, String name, Boolean isFire) {
		this.setAge(age);
		this.length = length;
		this.level = level;
		this.name = name;
		this.isFire = isFire;
	}

}
