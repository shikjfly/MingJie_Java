package chap03;

import java.util.*;

class Test6{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a的值：");
		int a = stdIn.nextInt();
		
		if(a>0) {
			if(a%10==0) {
				System.out.println("该值是10的倍数。");
			}else {
				System.out.println("该值不是10的倍数。");
			}
		}else {
			System.out.println("输入的不是正值。");
		}
	}
}
