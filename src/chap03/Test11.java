package chap03;

import java.util.*;
public class Test11 {
	public static void main(String[] args) {
		Random rand = new Random();
		int hand = rand.nextInt(12)+1;
		System.out.println("������ɵ�����"+hand+"��");
		switch(hand) {
			case 3: 
			case 1: 
			case 2: 
				System.out.println("����"); break;
			case 6: 
			case 4: 
			case 5: 
				System.out.println("����"); break;
			case 9: 
			case 7: 
			case 8: 
				System.out.println("����"); break;
			case 12: 
			case 10: 
			case 11: 
				System.out.println("����"); break;
		}


	}
}
