package chap03;

import java.util.*;

class Test5{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a的值：");
		int a = stdIn.nextInt();
		
		if(a>0) {
			if(a%3==0) {
				System.out.println("该值可以被3整除。");
			}else if(a%3==1) {
				System.out.println("该值除3余1。");
			}else {
				System.out.println("该值除3余2。");
			}
		}else {
			System.out.println("输入的不是正值。");
		}
	}
}
