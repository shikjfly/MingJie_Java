package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Rabbit {
	public int money; // û��static��ÿ��������һ���Լ���money����
	public static String food;
	public Rabbit(int money, String food) {
		this.money = money;
		Rabbit.food = food;
	}
	static public void getTime() {
		//��ȡ��ǰ�ĺ���ʱ��
		Date nowTime = new Date(System.currentTimeMillis());
		//��ʽ�����ߣ���ʱ�����ó�yyyy-MM-dd�ĸ�ʽ������
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd H:m");
		//��ǰ���������һ��
		String timeStr = sf.format(nowTime);
		System.out.println("��ǰʱ�䣺"+timeStr);		
	}
	
	public static void main(String[] args) {
		Rabbit r1 = new Rabbit(30,"�ܲ�");
		System.out.println(r1.money+Rabbit.food);
		Rabbit.getTime();
		
		Rabbit r2 = new Rabbit(2220,"����");
		System.out.println(r2.money+Rabbit.food);
		
		//food��֮ǰ���ܲ��ĳɹ��������ˣ�r1
		System.out.println(r1.money+r1.food);
		
		
	}
}
