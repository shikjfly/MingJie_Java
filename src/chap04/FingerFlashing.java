package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class FingerFlashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int hand;
		do {
			System.out.println("0-石头、1-剪刀、2-布");
			hand = stdIn.nextInt();
		} while (hand<0 || hand>2);
		
		if (hand==0) {
			System.out.println("石头");
		} else if (hand==1) {
			System.out.println("剪刀");
		}else{
			System.out.println("布");
		}
		
	}

}
