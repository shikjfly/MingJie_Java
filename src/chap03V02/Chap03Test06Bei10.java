package chap03V02;

import java.util.Scanner;

public class Chap03Test06Bei10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数值：");
		int n = stdIn.nextInt();
				
		if (n>0) {
			if (n%10 == 0) {
				System.out.println("该值是10的倍数。");
			}else {
				System.out.println("该值不是10的倍数。");
			}
		}else {
			System.out.println("输入的不是正值。");
		}
		stdIn.close();

	}

}
