package chap03;

import java.util.*;
public class Test10 {
	public static void main(String[] args) {
		System.out.println("��ѡ�����ƣ�0...ʯͷ/1...����/2...������"); 
		Random rand = new Random();
		int hand = rand.nextInt(3);
		System.out.println("������ɵ�����"+hand+"��");
		switch(hand) {
			case 0: System.out.println("ʯͷ"); break;
			case 1: System.out.println("����"); break;
			case 2: System.out.println("��"); break;
		}


	}
}
