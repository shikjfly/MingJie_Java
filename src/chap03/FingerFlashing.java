package chap03;

import java.util.*;
public class FingerFlashing {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("��ѡ�����ƣ�0...ʯͷ/1...����/2...������");  
		int hand = stdIn.nextInt();
		switch (hand) {
		case 0:
			System.out.println("ʯͷ");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		default:
			break;
		}
		
	}
}
