package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class FingerFlashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int hand;
		do {
			System.out.println("0-ʯͷ��1-������2-��");
			hand = stdIn.nextInt();
		} while (hand<0 || hand>2);
		
		if (hand==0) {
			System.out.println("ʯͷ");
		} else if (hand==1) {
			System.out.println("����");
		}else{
			System.out.println("��");
		}
		
	}

}
