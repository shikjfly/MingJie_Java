package chap03;

import java.util.*;

class Test4{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a的值：");
		int a = stdIn.nextInt();
		
		if(a>0) {
			if(a%5==0) {
				System.out.println("该值可以被5整除。");
			}else {
				System.out.println("该值不可以被5整除。");
			}
		}else {
			System.out.println("输入的不是正值。");
		}
	}
}
