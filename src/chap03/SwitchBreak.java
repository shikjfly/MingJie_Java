package chap03;

import java.util.*;
public class SwitchBreak {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("ÕûÊý£º");  
		int hand = stdIn.nextInt();
		switch (hand) {
		case 0:
			System.out.println("AB");
			break;
		case 2:
			System.out.println("CD");
			break;
		case 5:
			System.out.println("D");
			break;
		case 6:
		case 7:
			System.out.println("E");
			break;
		case 8:
			System.out.println("F");
			break;
		default:
			break;
		}
		
	}
}
