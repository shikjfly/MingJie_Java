package chap03;

import java.util.*;
public class MinMaxtest3No {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("变量a：");  int a = stdIn.nextInt();
		System.out.println("变量b：");  int b = stdIn.nextInt();
		System.out.println("变量c：");  int c = stdIn.nextInt();
		System.out.println("排序成c<=b<= a。");

		if (a>b) {
			int t;
			t = a;
			a = b;
			b = t;
		}
		if (a>c) {
			int t;
			t = a;
			a = c;
			c = t;
		}
		if (b>c) {
			int t;
			t = b;
			b = c;
			c = t;
		}

		System.out.println("变量a："+a+"。");  
		System.out.println("变量b："+b+"。");  
		System.out.println("变量c："+c+"。");  
	}
}
