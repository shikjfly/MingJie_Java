package chap03;

import java.util.*;
public class Test10 {
	public static void main(String[] args) {
		System.out.println("请选择手势（0...石头/1...剪刀/2...布）："); 
		Random rand = new Random();
		int hand = rand.nextInt(3);
		System.out.println("随机生成的数："+hand+"。");
		switch(hand) {
			case 0: System.out.println("石头"); break;
			case 1: System.out.println("剪刀"); break;
			case 2: System.out.println("布"); break;
		}


	}
}
