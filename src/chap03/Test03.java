package chap03;

import java.util.*;

class Test03{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a的值：");
		int a = stdIn.nextInt();
		System.out.println("b的值：");
		int b = stdIn.nextInt();
		
		if(a>b) {
			System.out.println("a更大。");
		}else if(a==b) {
			System.out.println("a和b相等。");
		}else {
			System.out.println("b更大。");
		}
	}
}
