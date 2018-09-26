package chap03V02;

import java.util.Scanner;

public class Chap03Test05Chu5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数值：");
		int n = stdIn.nextInt();
				
		if (n>0) {
			if (n%5 == 0) {
				System.out.println("该值可以被5除。");
			}else {
				System.out.println("该值不可以被5除。");
			}
		}else {
			System.out.println("输入的不是正值。");
		}
		stdIn.close();

	}

}
