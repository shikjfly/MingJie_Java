package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class CountDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("倒数。");
		int x;
		do {
			System.out.println("正整数值： ");
			x = stdIn.nextInt();
		} while (x<0);
		
		while (x>=0) {
			System.out.println(x--);
		}
		System.out.println("x的值"+x);
	}

}
