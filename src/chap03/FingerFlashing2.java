package chap03;

import java.util.*;
public class FingerFlashing2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("��ѡ�����ƣ�0...ʯͷ/1...����/2...������");  
		int hand = stdIn.nextInt();
		if (hand == 1) {
			System.out.println("����");
		} else if(hand == 0){
			System.out.println("ʯͷ");
		}else {
			System.out.println("��");
		}
	}
}
