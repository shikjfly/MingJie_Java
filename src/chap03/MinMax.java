package chap03;

import java.util.*;
public class MinMax {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("变量a：");  int a = stdIn.nextInt();
		System.out.println("变量b：");  int b = stdIn.nextInt();
		System.out.println("排序成a<=b。");
		
		if (a>b) {
			int t;
			t = a;
			a = b;
			b = t;
		}

		System.out.println("变量a："+a+"。");  
		System.out.println("变量b："+b+"。");  
	}
}
